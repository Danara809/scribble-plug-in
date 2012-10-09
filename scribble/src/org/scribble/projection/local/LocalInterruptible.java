package org.scribble.projection.local;

import java.util.Iterator;
import java.util.List;


public class LocalInterruptible extends LocalInteraction{

	private List<String> roleNames;
	private List<LocalMessageSignature> signatures;
	private LocalInteraction body;

	@Override
	public String prettyPrint(int indent) {
		String result = addIndent(indent);
		result+="interruptible {";
		result+=body.prettyPrint(indent+1);
		result+=addIndent(indent)+"}";
		
		//Print the interruption messages
		Iterator<String> itRoles = roleNames.iterator();
		Iterator<LocalMessageSignature> itSignatures = signatures.iterator();
		result+="by "+itRoles.next()+" with "+itSignatures.next().prettyPrint();
		while(itRoles.hasNext()&&itSignatures.hasNext()){
			result+=", by "+itRoles.next()+" with "+itSignatures.next().prettyPrint();
		}
		result+=";";
		result+=this.following.prettyPrint(indent);
		return result;
	}

	public void setBody(LocalInteraction body) {
		this.body = body;
		
	}

	public void setRoleNames(List<String> roleNames) {
		this.roleNames= roleNames;
		
	}

	public void setMessageSignatures(List<LocalMessageSignature> signatures) {
		this.signatures = signatures;
	}

}
