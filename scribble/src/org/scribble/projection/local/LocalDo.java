package org.scribble.projection.local;

import java.util.Iterator;
import java.util.List;

public class LocalDo extends LocalInteraction{

	private String targetProtocolName;
	private List<String> targetRoles;
	private List<String> currentRoles;
	private List<LocalMessageSignature> arguments;

	@Override
	public String prettyPrint(int indent) {
		String result = this.addIndent(indent);
		result+="do ";
		result+=targetProtocolName+" ";
		
		//Print the parameters
		if(arguments.size()>0){
			Iterator<LocalMessageSignature> it = arguments.iterator();
			result+="<sig "+it.next().prettyPrint();
			while(it.hasNext()){
				result+=", sig "+it.next().prettyPrint();
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

	public void setArguments(List<LocalMessageSignature> arguments) {
		this.arguments = arguments;
		
	}

	public void setCurrentRoles(List<String> currentRoles) {
		this.currentRoles = currentRoles;
		
	}

	public void setTargetRoles(List<String> targetRoles) {
		this.targetRoles = targetRoles;
		
	}

	public void setTargetProtocolName(String protocolName) {
		this.targetProtocolName = protocolName;
		
	}

}
