package org.scribble.projection.local;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;

public class LocalSpawn extends LocalInteraction{

	private String roleName;
	private List<String> parameters;
	private List<String> currentRoles;
	private EList<String> targetRoles;
	private String targetProtocolName;

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		
	}

	public void setParameters(EList<String> parameters) {
		this.parameters = parameters;
		
	}

	public void setCurrentRoles(EList<String> currentRoles) {
		this.currentRoles = currentRoles;
		
	}

	public void setTargetRoles(EList<String> targetRoles) {
		this.targetRoles = targetRoles;
		
	}

	public void setTargetProtocolame(String targetProtocolName) {
		this.targetProtocolName = targetProtocolName;
		
	}

	@Override
	public String prettyPrint(int indent) {
		String result = this.addIndent(indent);
		result+=roleName+" spawns ";
		result+=targetProtocolName+" ";
		
		//Print the parameters
		if(parameters.size()>0){
			Iterator<String> it = parameters.iterator();
			result+="<sig "+it.next();
			while(it.hasNext()){
				result+=", sig "+it.next();
			}
			result+="> ";
		}
	
		//Print the roles
		Iterator<String> itCurrent = currentRoles.iterator();
		Iterator<String> itTarget = targetRoles.iterator();
		
		result+="("+itCurrent.next()+" as "+itTarget.next();
		while(itCurrent.hasNext()&&itTarget.hasNext()){
			result+=", "+itCurrent.next()+" as "+itTarget.next();
		}
		result+=");";
		result+=this.following.prettyPrint(indent);
		return result;
	}

}
