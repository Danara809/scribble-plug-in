package org.scribble.projection.local;

public class LocalMessage extends LocalInteraction{

	private LocalMessageSignature signature;
	private String receiver;
	private String sender;
	private String projectedRole;

	public String prettyPrint(int indent) {
		String result = addIndent(indent);
		result+=signature.prettyPrint();
		if(receiver.equals(projectedRole))
			result+=" from "+sender;
		else if (sender.equals(projectedRole))
			result+=" to "+receiver;
	    result+=";";
	    result+=following.prettyPrint(indent);
		return result;
	}



	public void setSignature(LocalMessageSignature signature) {
		this.signature = signature;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
		
	}
	
	public void setSender(String sender) {
		this.sender = sender;
		
	}

	public void setProjectedRole(String projectedRole) {
		this.projectedRole = projectedRole;		
	}

	public LocalMessage project() {
		if(sender.equals(projectedRole)||receiver.equals(projectedRole))
			return this;
		else
			return null;
	}



}
