package org.scribble.projection.local;

public class LocalRecursion extends LocalInteraction {

	private String loopName;
	private LocalInteraction body;

	public void setLoopName(String loopName) {
		this.loopName = loopName;
		
	}

	public void setBody(LocalInteraction body) {
		this.body = body;
		
	}

	public String prettyPrint(int indent) {
			String result = addIndent(indent)+"rec "+loopName+" {";
			result+=body.prettyPrint(indent+1);
			result+=addIndent(indent)+"}";
			result+=this.following.prettyPrint(indent);
			return result;
		}



}
