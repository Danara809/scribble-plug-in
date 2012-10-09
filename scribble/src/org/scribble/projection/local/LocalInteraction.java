package org.scribble.projection.local;

import org.scribble.scribble.PayloadType;

public abstract class LocalInteraction {

	protected LocalInteraction following;

	public abstract String prettyPrint(int indent);
	
	public LocalInteraction getFollowing(){
		return this.following;
	}
	
	public void setFollowing(LocalInteraction following){
		this.following = following;
	}
	
	public String addIndent(int indent){
		String result = "\n";
		for (int i=0;i<indent;i++)
			result+="\t";
		return result;
	}

	public void appendFollowing(LocalInteraction localInteraction){
		if(following==null)
			following=localInteraction;
		else
			following.appendFollowing(localInteraction);
	}

	public LocalInteraction getLast() {
		if(this.getFollowing()!=null && !(this.getFollowing()  instanceof LocalEnd))
			return this.getFollowing().getLast();
		else 
			return this;
	}
	
}
