package org.scribble.projection;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.scribble.projection.local.LocalChoice;
import org.scribble.projection.local.LocalContinue;
import org.scribble.projection.local.LocalDo;
import org.scribble.projection.local.LocalEnd;
import org.scribble.projection.local.LocalInteraction;
import org.scribble.projection.local.LocalInterruptible;
import org.scribble.projection.local.LocalMessage;
import org.scribble.projection.local.LocalMessageSignature;
import org.scribble.projection.local.LocalParallel;
import org.scribble.projection.local.LocalPayLoadType;
import org.scribble.projection.local.LocalProgram;
import org.scribble.projection.local.LocalProtocol;
import org.scribble.projection.local.LocalRecursion;
import org.scribble.projection.local.LocalSpawn;
import org.scribble.projection.local.LocalTypeDecl;
import org.scribble.scribble.Choice;
import org.scribble.scribble.Continue;
import org.scribble.scribble.Do;
import org.scribble.scribble.GlobalInteraction;
import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.GlobalProtocolDecl;
import org.scribble.scribble.IncludeDecl;
import org.scribble.scribble.Interruptible;
import org.scribble.scribble.Message;
import org.scribble.scribble.MessageSignature;
import org.scribble.scribble.Parallel;
import org.scribble.scribble.PayloadType;
import org.scribble.scribble.Recursion;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.Spawn;
import org.scribble.scribble.TypeDecl;

public class Projection {
	
	private File srcGenDirectory;
	private List<LocalTypeDecl> resultType;
	private List<String> resultInclude;
	private HashMap<String,List<GlobalProtocolDecl> > rolesToGlobalProtocols;
	private ScribbleProgram globalProgram;
	private LocalProgram localProgram;
		
	public Projection( File srcGenDirectory )
	{	
		//Store the directory for generating the solutions
		if ( srcGenDirectory.exists() == false ) {
			srcGenDirectory.mkdirs();
		}
		this.srcGenDirectory = srcGenDirectory;
	}
	
	public void run( ScribbleProgram program)
	{

		//Initialize the data structures 
		resultInclude = new ArrayList<String>();
		resultType = new ArrayList<LocalTypeDecl>();
		globalProgram = program;
		
		
		buildRolesMap();
		
		projectIncludeList();
		projectTypeDeclList();
		projectGlobalProtocols();	
	}

	private void buildRolesMap() {
		rolesToGlobalProtocols = new HashMap<String,List<GlobalProtocolDecl> >();
		Iterator<GlobalProtocolDecl> itProtocols = globalProgram.getGlobalProtocolDecl().iterator();
		
		//Find all the global protocols in the file
		while (itProtocols.hasNext()){
			GlobalProtocolDecl gpd = itProtocols.next();
			Iterator<String> itRoles =gpd.getRoles().iterator();
			
			//For each role, add a new protocol to the list it maps to
			while(itRoles.hasNext()){
				String role = itRoles.next();
				if(rolesToGlobalProtocols.containsKey(role)){
					List<GlobalProtocolDecl> gpdList = rolesToGlobalProtocols.get(role);
					gpdList.add(gpd);
				}
				else{
					List<GlobalProtocolDecl> gpdList = new ArrayList<GlobalProtocolDecl>();
					gpdList.add(gpd);
					rolesToGlobalProtocols.put(role,gpdList);
				}	
			}			
		}		
	}

	private void projectGlobalProtocols() {

		//Get set of roles present in the program without duplications
		Set<String> roles = rolesToGlobalProtocols.keySet();
		Iterator<String> itRoles = roles.iterator();
		
		//Create a Local Program for each
		while(itRoles.hasNext()){
			String role = itRoles.next(); 
			localProgram = new LocalProgram(srcGenDirectory,role);
			localProgram.setIncludes(resultInclude);
			localProgram.setTypeDecl(resultType);
			Iterator<GlobalProtocolDecl> itProtocols = rolesToGlobalProtocols.get(role).iterator();
			
			//Add the local protocols projected from every protocol the role maps to in the Local Program
			while( itProtocols.hasNext()){
				LocalProtocol lpd = projectGlobalProtocol(itProtocols.next(),role);
				localProgram.addLocalProtocol(lpd);
			}
			
			//PrettyPrints and saves the whole local program in the <Original File Name>@<projected Role>.spr format
			localProgram.save();
		}
	}

	private LocalProtocol projectGlobalProtocol(GlobalProtocolDecl gpd, String role) {
		if(gpd.getRoles().contains(role)){
			LocalProtocol lpd = new LocalProtocol();

			//Checks if the name is not already present in the local protocols
			String localName = gpd.getProtocolName()+"@"+role;
			if(!localProgram.hasProtocol(localName))
			{
				lpd.setProtocolName(gpd.getProtocolName()+"@"+role);
				lpd.setProjectedRole(role);
				lpd.setRoles(gpd.getRoles());
				lpd.setParameters(gpd.getParameters());
				lpd.setBody(projectBlock(gpd.getBody(),role));
				return lpd;
			}
			else return null;
		}
		else return null;
	}

	private LocalInteraction projectBlock(GlobalInteractionBlock block,String projectedRole) {
		List<GlobalInteraction> interactionList = block.getInteractionsequence();
		Iterator<GlobalInteraction> it = interactionList.iterator();
		LocalInteraction li = null;
		LocalInteraction first = null;
		while(it.hasNext()){
			if (li==null){
				li =projectInteraction(it.next(),projectedRole);
				first = li;
			}
			else{
				li.setFollowing(projectInteraction(it.next(),projectedRole));
				li=li.getLast();
			}
		}
		if(first==null)
			return new LocalEnd();
		else{
			first.appendFollowing(new LocalEnd());
			return first;
		}
	}


	private LocalInteraction projectInteraction(GlobalInteraction interaction,String projectedRole) {
		if(interaction instanceof Message)
			return projectMessage((Message) interaction,projectedRole);
		else if (interaction instanceof Parallel)
			return projectParallel((Parallel) interaction,projectedRole);
		else if (interaction instanceof Choice)
			return projectChoice((Choice) interaction,projectedRole);	
		else if (interaction instanceof Recursion)
			return projectRecursion((Recursion) interaction,projectedRole);
		else if (interaction instanceof Continue)
			return projectContinue((Continue) interaction,projectedRole);
		else if (interaction instanceof Interruptible)
			return projectInterruptible((Interruptible) interaction,projectedRole);
		else if (interaction instanceof Do)
			return projectDo((Do) interaction, projectedRole);
		else if (interaction instanceof Spawn)
			return projectSpawn((Spawn) interaction,projectedRole);
		else 
			return null;
	}
	
	private LocalInteraction projectSpawn(Spawn interaction,String projectedRole) {

		//Check if the projected role is involved in the spawn
		if(interaction.getCurrentRoles().contains(projectedRole))
		{
			//Find the target protocol
			GlobalProtocolDecl targetProtocol = null;
			Iterator<GlobalProtocolDecl> it = globalProgram.getGlobalProtocolDecl().iterator();

			while(it.hasNext()){
				GlobalProtocolDecl nextProtocol = it.next();
				if(nextProtocol.getProtocolName().equals(interaction.getTargetProtocolName())){
					targetProtocol = nextProtocol;
					break;
				}
			}
			//Find the target role of the projectedRole in the spawn
			int projectedRoleIndex = interaction.getCurrentRoles().indexOf(projectedRole);
			String targetProjectedRole = interaction.getTargetRoles().get(projectedRoleIndex);

			//Add the projected target protocol to the local program 
			LocalProtocol projectedTarget = projectGlobalProtocol(targetProtocol,targetProjectedRole);
			localProgram.addLocalProtocol(projectedTarget);

			//Project the do line (no change except the name of the protocol)
			LocalSpawn localSpawn = new LocalSpawn();
			localSpawn.setRoleName(interaction.getRoleName());
			localSpawn.setParameters(interaction.getParameters());
			localSpawn.setCurrentRoles(interaction.getCurrentRoles());
			localSpawn.setTargetRoles(interaction.getTargetRoles());
			localSpawn.setTargetProtocolame(interaction.getTargetProtocolName()+"@"+targetProjectedRole);
			return localSpawn;
		}
		else 
			return null;
	}

	private LocalInteraction projectDo(Do interaction, String projectedRole) {
		//Check if the projected role is involved in the spawn
		if(interaction.getCurrentRoles().contains(projectedRole))
		{
			//Find the target protocol
			GlobalProtocolDecl targetProtocol = null;
			Iterator<GlobalProtocolDecl> it = globalProgram.getGlobalProtocolDecl().iterator();

			while(it.hasNext()){
				GlobalProtocolDecl nextProtocol = it.next();
				if(nextProtocol.getProtocolName().equals(interaction.getTargetProtocolName())){
					targetProtocol = nextProtocol;
					break;
				}
			}
			//Find the target role of the projectedRole in the spawn
			int projectedRoleIndex = interaction.getCurrentRoles().indexOf(projectedRole);
			String targetProjectedRole = interaction.getTargetRoles().get(projectedRoleIndex);

			//Add the projected target protocol to the local program 
			LocalProtocol projectedTarget = projectGlobalProtocol(targetProtocol,targetProjectedRole);
			localProgram.addLocalProtocol(projectedTarget);
			
			//compute the arguments
			Iterator<MessageSignature> itSignatures = interaction.getArguments().iterator();
			List<LocalMessageSignature> localArguments = new ArrayList<LocalMessageSignature>();
			while(itSignatures.hasNext()){
				localArguments.add(projectMessageSignature(itSignatures.next()));
			}
			

			//Project the do line (no change except the name of the protocol)
			LocalDo localDo = new LocalDo();
			localDo.setArguments(localArguments);
			localDo.setCurrentRoles(interaction.getCurrentRoles());
			localDo.setTargetRoles(interaction.getTargetRoles());
			localDo.setTargetProtocolName(interaction.getTargetProtocolName()+"@"+targetProjectedRole);
			return localDo;
		}
		else 
			return null;

	}


	private LocalInteraction projectInterruptible(Interruptible interaction, String projectedRole) {
		LocalInteraction body = projectBlock(interaction.getBody(),projectedRole);
		if(!(body instanceof LocalEnd)){
			LocalInterruptible  localInterruptible= new LocalInterruptible();
			localInterruptible.setBody(body);
			localInterruptible.setRoleNames(interaction.getRoleNames());
			
			//compute the arguments
			Iterator<MessageSignature> itSignatures = interaction.getSignatures().iterator();
			List<LocalMessageSignature> localSignatures = new ArrayList<LocalMessageSignature>();
			while(itSignatures.hasNext()){
				localSignatures.add(projectMessageSignature(itSignatures.next()));
			}
			
			localInterruptible.setMessageSignatures(localSignatures);
			return localInterruptible;
		}		
		else
			return null;
	}

	private LocalInteraction projectRecursion(Recursion interaction,String projectedRole) {
		LocalRecursion localRecursion = new LocalRecursion();
		localRecursion.setLoopName(interaction.getLoopName());
		localRecursion.setBody(projectBlock(interaction.getBody(),projectedRole));
		return localRecursion;
	}
	
	private LocalInteraction projectContinue(Continue interaction, String projectedRole){
		return new LocalContinue(interaction.getLoopName());
	}

	private LocalInteraction projectChoice(Choice interaction, String projectedRole){
		List<GlobalInteractionBlock> branches = interaction.getBranches();
		Iterator<GlobalInteractionBlock> it = branches.iterator();
		List<LocalInteraction> localBranches = new ArrayList<LocalInteraction>();
		while(it.hasNext()){
			LocalInteraction lib = projectBlock(it.next(),projectedRole);
			if (lib!=null && !(lib instanceof LocalEnd) )
					localBranches.add(lib);
		}
		if(localBranches.size()==0) //None of the branches in the choice outputs a projection
			return null;
		else //Normal case where we still keep the choice as such
			return new LocalChoice(localBranches,interaction.getRole());		
	}

	private LocalInteraction projectParallel(Parallel interaction,String projectedRole) {
		List<GlobalInteractionBlock> branches = interaction.getBranches();
		Iterator<GlobalInteractionBlock> it = branches.iterator();
		List<LocalInteraction> localBranches = new ArrayList<LocalInteraction>();
		while(it.hasNext()){
			LocalInteraction lib = projectBlock(it.next(),projectedRole);
			if (lib!=null && !(lib instanceof LocalEnd))
					localBranches.add(lib);
		}
		
		//
		if(localBranches.size()==0) //None of the branches in the parallel outputs a projection
			return null;
		else if (localBranches.size()==1){ //Only one possibility, added as the following of the previous interaction sequence
			return localBranches.get(0);
		}	
		else //Normal case where we still keep the parallel as such
			return new LocalParallel(localBranches);
	}

	private LocalInteraction projectMessage(Message message, String projectedRole) {
		LocalMessage localMessage =  new LocalMessage();
		localMessage.setProjectedRole(projectedRole);
		localMessage.setSender(message.getSender());
		localMessage.setReceiver(message.getReceiver());
		localMessage.setSignature(projectMessageSignature(message.getSignature()));
		return localMessage.project();
	}

	private void projectTypeDeclList() {
		EList<TypeDecl> globalTypes = globalProgram.getTypeDecl();
		Iterator<TypeDecl> it = globalTypes.iterator();
		while(it.hasNext()){
			TypeDecl t = it.next();
			LocalTypeDecl lt = new LocalTypeDecl(t.getTypeName(),t.getSchema(),t.getFile(),t.getAlias());
			resultType.add(lt);
		}
	}

	private void projectIncludeList() {
		EList<IncludeDecl> globalIncludes = globalProgram.getIncludeDecl();
		Iterator<IncludeDecl> it = globalIncludes.iterator();
		while(it.hasNext()){
			String s = it.next().getImportURI();
			resultInclude.add(s);
		}		
	}
	
	private LocalMessageSignature projectMessageSignature(MessageSignature ms) {
		LocalMessageSignature lms = new LocalMessageSignature();
		lms.setOperator(ms.getOperator());
		Iterator<PayloadType> it = ms.getPayloadTypes().iterator();
		while(it.hasNext()){
			PayloadType plt = it.next();
			lms.addPayLoad(new LocalPayLoadType(plt.getPayload(),plt.getDataType()));
		}
		return lms;
	}

}
