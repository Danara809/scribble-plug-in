package org.scribble.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.scribble.scribble.Choice;
import org.scribble.scribble.Continue;
import org.scribble.scribble.Do;
import org.scribble.scribble.GlobalInteraction;
import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.GlobalProtocolDecl;
import org.scribble.scribble.Interruptible;
import org.scribble.scribble.Message;
import org.scribble.scribble.Parallel;
import org.scribble.scribble.Recursion;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.Spawn;

public class TypeChecker {

	private ScribbleProgram program;
	private AbstractDeclarativeValidator validator;
	private boolean errorFound;
	private List<String> errors;
	
	public TypeChecker(ScribbleProgram program){
		this.program = program;
		this.validator = new MockValidator();
		this.errors = new ArrayList<String>();
		this.errorFound = false;
	}

	public TypeChecker(ScribbleProgram program,
			AbstractDeclarativeValidator validator) {
		this.errors = new ArrayList<String>();
		this.program = program;
		this.validator=validator;
		this.errorFound = false;
	}
	
	private class MockValidator extends AbstractDeclarativeValidator{
		
		@SuppressWarnings("unused")
		void acceptError(String message, EObject object, int offset, int length, String code, String issueData){}
		
	};
	
	private boolean sameMessage(Message message1,Message message2){
		return (message1.getSender().equals(message2.getSender()))
				&&(message1.getReceiver().equals(message2.getReceiver()))
				&&(message1.getSignature().getOperator().equals(message2.getSignature().getOperator()));
	}


	public void run() {
		Iterator<GlobalProtocolDecl> it =  program.getGlobalProtocolDecl().iterator();
		while(it.hasNext()){
			checkProtocol(it.next());
		}
	}
	
	public boolean errorFound(){
		return errorFound;
	}
	
	private void checkProtocol(GlobalProtocolDecl protocol) {
		checkBlock(protocol.getBody(),protocol);
	}

	private void checkBlock(GlobalInteractionBlock block,GlobalProtocolDecl protocol) {
		Iterator<GlobalInteraction> it = block.getInteractionsequence().iterator();
		while(it.hasNext()){
			GlobalInteraction interaction = it.next();
			if (interaction instanceof Message)
				checkMessage((Message) interaction,protocol);
			
			else if (interaction instanceof Choice)
				checkChoice((Choice) interaction,protocol);
			
			else if (interaction instanceof Recursion)
				checkRecursion((Recursion) interaction,protocol);
			
			else if (interaction instanceof Parallel)
				checkParallel((Parallel) interaction,protocol);
			
			else if (interaction instanceof Interruptible)
				checkInterruptible((Interruptible) interaction,protocol);
			
			else if (interaction instanceof Do)
				checkDo((Do) interaction,protocol);
				
			else if (interaction instanceof Spawn)
				checkSpawn((Spawn) interaction,protocol);
			
		}
		
	}
	
	

	private void checkSpawn(Spawn interaction, GlobalProtocolDecl protocol) {
		//Check if the target protocol exists
		GlobalProtocolDecl targetProtocol = null;
		Iterator<GlobalProtocolDecl> it = program.getGlobalProtocolDecl().iterator();
		
		while(it.hasNext()){
			GlobalProtocolDecl nextProtocol = it.next();
			if(nextProtocol.getProtocolName().equals(interaction.getTargetProtocolName())){
				targetProtocol = nextProtocol;
				break;
			}
		}
		
		if(targetProtocol==null)
			displayError("WellFormedNess error : the specified target protocol is not declared", interaction);
		else{
			if( !(targetProtocol.getRoles().size()==interaction.getTargetRoles().size())
					||(!targetProtocol.getRoles().containsAll(interaction.getTargetRoles()))
					||(!interaction.getTargetRoles().containsAll(targetProtocol.getRoles())))
				displayError("WellFormedNess error : the target roles do not match the target protocol's roles list", interaction);

			if(!protocol.getRoles().containsAll(interaction.getCurrentRoles()))
				displayError("WellFormedNess error : the instantiated roles are not declared in the current protocol ", interaction);

			if(interaction.getTargetProtocolName()==protocol.getProtocolName())
				displayError("WellFormedNess error : a protocol can not spawn itself",interaction);

			if ((interaction.getParameters()==null)!=(targetProtocol.getParameters()==null))
				displayError("WellFormedNess error : the parameters list in the spawn does not match the target protocol",interaction);

			if ((interaction.getParameters()!=null)
					&&(targetProtocol.getParameters().size()!=interaction.getParameters().size()))
				displayError("WellFormedNess error : the parameters list in the spawn does not match the target protocol",interaction);

			if(!interaction.getCurrentRoles().contains(interaction.getRoleName()))
				displayError("WellFormedNess error : the spawning role should appear in the instantiated role list",interaction);
		
			if(!protocol.getRoles().contains(interaction.getRoleName()))
				displayError("WellFormedNess error : the spawning role is not declared in the current protocol",interaction);
				
		}
	}

	private void checkDo(Do interaction, GlobalProtocolDecl protocol) {
		//Check if the target protocol exists
		GlobalProtocolDecl targetProtocol = null;
		Iterator<GlobalProtocolDecl> it = program.getGlobalProtocolDecl().iterator();
		while(it.hasNext()){
			GlobalProtocolDecl nextProtocol = it.next();
			if(nextProtocol.getProtocolName().equals(interaction.getTargetProtocolName())){
				targetProtocol = nextProtocol;
				break;
			}
		}
		if(targetProtocol==null)
			displayError("WellFormedNess error : the specified target protocol is not declared", interaction);
		else{
			if( !(targetProtocol.getRoles().size()==interaction.getTargetRoles().size())
					||(!targetProtocol.getRoles().containsAll(interaction.getTargetRoles()))
					||(!interaction.getTargetRoles().containsAll(targetProtocol.getRoles())))
				displayError("WellFormedNess error : the target roles do not match the target protocol's roles list", interaction);

			if(!protocol.getRoles().containsAll(interaction.getCurrentRoles()))
				displayError("WellFormedNess error : the instantiated roles are not declared in the current protocol ", interaction);
			
			if ((interaction.getArguments()==null)!=(targetProtocol.getParameters()==null))
				displayError("WellFormedNess error : the parameters list in the spawn does not match the target protocol",interaction);

			if ((interaction.getArguments()!=null)
					&&(targetProtocol.getParameters().size()!=interaction.getArguments().size()))
				displayError("WellFormedNess error : the parameters list in the spawn does not match the target protocol",interaction);

		}
	}

	private void checkInterruptible(Interruptible interaction,GlobalProtocolDecl protocol) {
		
		//Check for the origin of the messages sent
		Set<String> roleNames= new HashSet<String>(interaction.getRoleNames());
		if(roleNames.size()>1)
			displayError("WellFormedNess error : All Messages should be sent by the same role", interaction);
		else if(roleNames.size()==1 && !protocol.getRoles().contains(roleNames.iterator().next()))
			displayError("WellFormedNess error : The role sending the messages is not declared", interaction);
		else if(roleNames.size()==0)
			displayError("WellFormedNess error : The interruptible block should have at least one Message signature",interaction);
		
		checkForUnmatchedContinue(interaction.getBody(), new HashSet<String>());
		
		checkBlock(interaction.getBody(),protocol);
		
	}

	private void checkParallel(Parallel interaction, GlobalProtocolDecl protocol) {
		Iterator<GlobalInteractionBlock> it = interaction.getBranches().iterator();
		List<Message> messages = new ArrayList<Message>();
		while(it.hasNext()){
			GlobalInteractionBlock gib = it.next();
			//GetAll Messages
			messages.addAll(getMessages(gib));
			//Check for an invalid continue inside the parallel block
			checkForUnmatchedContinue(gib,new HashSet<String>());
			//Perform the well formedness checking on the branch
			checkBlock(gib,protocol);
		}
		//Checks the list of all messages present in the branches for duplications
		Iterator<Message> it1,it2;
		Message message1,message2;
		Set<Message> identifiedDuplicates = new HashSet<Message>();
		it1 = messages.iterator();
		while(it1.hasNext()){
			message1=it1.next();
			it2 = it1;
			while(it2.hasNext()){
				message2 = it2.next();
				if(sameMessage(message1,message2)){
					if(identifiedDuplicates.add(message1))
						displayError("WellFormedNess error : This message is duplicated in the same parallel",message1);
					if(identifiedDuplicates.add(message2))
						displayError("WellFormedNess error : This message is duplicated in the same parallel",message2);
				}
			}
		}
		if(identifiedDuplicates.size()>0)
			displayError("WellFormedNess error : This parallel contains duplicate messages",interaction);
	}

	private List<Message> getMessages(GlobalInteractionBlock gib) {
		Iterator<GlobalInteraction> it = gib.getInteractionsequence().iterator();
		List<Message> messages = new ArrayList<Message>(); 
		while(it.hasNext())
		{
			GlobalInteraction gi = it.next();
			if(gi instanceof Message)
				messages.add((Message) gi);
			else if (gi instanceof Choice){
				Iterator<GlobalInteractionBlock> itBranches = ((Choice) gi).getBranches().iterator();
				while(itBranches.hasNext()){
					messages.addAll(getMessages(itBranches.next()));
				}
			}else if (gi instanceof Parallel){
				Iterator<GlobalInteractionBlock> itBranches = ((Parallel) gi).getBranches().iterator();
				while(itBranches.hasNext()){
					messages.addAll(getMessages(itBranches.next()));
				}
			} else if (gi instanceof Interruptible)
				messages.addAll(getMessages(((Interruptible) gi).getBody()));
			 else if (gi instanceof Recursion)
				messages.addAll(getMessages(((Recursion) gi).getBody()));	
		}	
		return messages;
	}

	private void checkMessage(Message interaction,
			GlobalProtocolDecl protocol) {
		if(!protocol.getRoles().contains(interaction.getSender())){
			displayError("WellFormedNess error : Sender not declared in the current protocol",interaction);
		}
		if(!protocol.getRoles().contains(interaction.getReceiver())){
			displayError("WellFormedNess error : Receiver not declared in the current protocol",interaction);
		}
		if(interaction.getSender().equals(interaction.getReceiver())){
			displayError("WellFormedNess error : A message can not be sent to one self", interaction);
		}
		
	}
	
	private void checkChoice(Choice interaction, GlobalProtocolDecl protocol){
		//check if the role specified for the choser is valid
		if(!protocol.getRoles().contains(interaction.getRole())){
			displayError("WellFormedNess error : The specified role for the choser  is not declared",interaction);
			return;
		}	
		//check number of branches
		if(interaction.getBranches().size()<2){
			displayError("WellFormedNess error : There should be more than one block in the choice", interaction);
			return;
		}
		Iterator<GlobalInteractionBlock>itBranches = interaction.getBranches().iterator();
		
		 Set <String> receiversSet = new HashSet< String>();
		
		//Checks the first branch of the choice
		GlobalInteractionBlock gib = itBranches.next();	
		checkFirstMessageSender(gib,interaction);
		receiversSet = getReceiverSet(gib);
		receiversSet.remove(interaction.getRole());
		//check the validity of the branch
		checkBlock(gib,protocol);
		
		//If any receiver modify the set of receiver of the choice, then the block is not well formes
		while(itBranches.hasNext()){
			gib = itBranches.next();
			
			//check first message output in each branch
			checkFirstMessageSender(gib,interaction);
			
			//computes the sets of receivers in each branch
			Set<String> set = getReceiverSet(gib);
			set.remove(interaction.getRole());
			
			if(receiversSet.addAll(set)){
				displayError("WellFormedNess error : The sets of receivers does not match in each branch", interaction);
				break;
			}
			//check the validity of the branch
			checkBlock(gib,protocol);
		}
	}
	
	private Set<String> getReceiverSet(GlobalInteractionBlock gib) {
		Iterator<GlobalInteraction> it = gib.getInteractionsequence().iterator();
		Set<String> set = new HashSet<String>();
		while (it.hasNext()){
			GlobalInteraction interaction = it.next();
			if(interaction instanceof Message)
				set.add(((Message) interaction).getReceiver());
			else if (interaction instanceof Parallel){
				Iterator<GlobalInteractionBlock> itBranches = ((Parallel) interaction).getBranches().iterator();
				while(itBranches.hasNext()){
					set.addAll(getReceiverSet(itBranches.next()));
				}
			}
			else if (interaction instanceof Choice){
				Iterator<GlobalInteractionBlock> itBranches = ((Choice) interaction).getBranches().iterator();
				while(itBranches.hasNext()){
					set.addAll(getReceiverSet(itBranches.next()));
				}
			}
			else if (interaction instanceof Recursion)
					set.addAll(getReceiverSet(((Recursion) interaction).getBody()));	
			else if (interaction instanceof Interruptible)
				set.addAll(getReceiverSet(((Interruptible) interaction).getBody()));				
		}		
		return set;
	}

	private void checkRecursion(Recursion interaction, GlobalProtocolDecl protocol){
		int correspondingContinueFound=checkForContinue(interaction.getBody(),interaction.getLoopName());
		if(correspondingContinueFound<1)
			displayError("WellFormedNess error : The corresponding continue has not been found in the block",interaction);
		else if(correspondingContinueFound>1)
			displayError("WellFormedNess error : There is more than one continue in this block",interaction);
		
		checkBlock(interaction.getBody(),protocol);
	}
	
	private int checkForContinue(GlobalInteractionBlock block, String loopName) {
		Iterator<GlobalInteraction> it= block.getInteractionsequence().iterator();
		int correspondingContinueCount=0;
		while(it.hasNext()){
			GlobalInteraction gi = it.next();
			if(gi instanceof Continue ){
				if(!((Continue) gi).getLoopName().equals(loopName))
						displayError("WellFormedNess error : Invalid continue (wrong rec block)",gi);
				else
					correspondingContinueCount++;
			} else if(gi instanceof Choice){
				Iterator<GlobalInteractionBlock> itBranches = ((Choice) gi).getBranches().iterator();
				while (itBranches.hasNext()){
					correspondingContinueCount+=checkForContinue(itBranches.next(),loopName);
				}
			}
		}
		return correspondingContinueCount;
	}
	
	private void checkForUnmatchedContinue(GlobalInteractionBlock block,Set<String> currentLoops){
		Iterator<GlobalInteraction> it= block.getInteractionsequence().iterator();
		while(it.hasNext()){
			GlobalInteraction gi = it.next();
			if(gi instanceof Continue){
				if(!currentLoops.remove(((Continue) gi).getLoopName()))
					displayError("WellFormedNess error : Invalid continue",gi);				
			}
			else if(gi instanceof Recursion){
				currentLoops.add(((Recursion) gi).getLoopName());
				checkForUnmatchedContinue(((Recursion) gi).getBody(),currentLoops);
			}
			 else if(gi instanceof Choice){
					Iterator<GlobalInteractionBlock> itBranches = ((Choice) gi).getBranches().iterator();
					while (itBranches.hasNext()){
						checkForUnmatchedContinue(itBranches.next(),currentLoops);
					}
			 }
		}
	}

	private void checkFirstMessageSender(GlobalInteractionBlock gib,Choice choice){
		Iterator<GlobalInteraction> it = gib.getInteractionsequence().iterator();
		if(it.hasNext()){
			GlobalInteraction gi = it.next();
			if(gi instanceof Message){
				if(!((Message) gi).getSender().equals(choice.getRole())){
					displayError("WellFormedNess error : This message should be sent from "+choice.getRole(),gi);
					displayError("WellFormedNess error : Invalid first Message",choice);
				}
			} else if ((gi instanceof Parallel)){
				Iterator<GlobalInteractionBlock> itBranches = ((Parallel) gi).getBranches().iterator();
				while (itBranches.hasNext()){
					checkFirstMessageSender(itBranches.next(),choice);
				}
			} else if ((gi instanceof Choice)){
				Iterator<GlobalInteractionBlock> itBranches = ((Choice) gi).getBranches().iterator();
				while (itBranches.hasNext()){
					checkFirstMessageSender(itBranches.next(),choice);
				}
			} else if ((gi instanceof Recursion))
				checkFirstMessageSender(((Recursion) gi).getBody(),choice);
			else if (gi instanceof Interruptible)
				checkFirstMessageSender(((Interruptible) gi).getBody(),choice);
		} else {
			displayError("WellFormedNess error : This choice has an empty branch",choice);
		}
	}

				
	private void displayError( String error, GlobalInteraction interaction )
	{
		this.errorFound = true;
		int offset;
		int len;
		INode node = NodeModelUtils.findActualNodeFor( interaction );
		offset = node.getOffset();
		len = node.getLength();
		errors.add("Line "+node.getStartLine()+" "+error);
		validator.acceptError( error, interaction, offset, len, null );
	}

	public void printErrors() {
		Iterator<String> it = errors.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
