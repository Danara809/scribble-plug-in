package org.scribble.projection.local;

public class LocalContinue extends LocalInteraction {
	
	private String loopName;
	

	public LocalContinue(String loopName){
		this.loopName = loopName;
	}

	public String prettyPrint(int indent) {
			String result = addIndent(indent)+"continue "+loopName+";";
			result+=this.following.prettyPrint(indent);
			return result;
		}


}
