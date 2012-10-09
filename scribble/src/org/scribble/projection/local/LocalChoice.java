package org.scribble.projection.local;

import java.util.Iterator;
import java.util.List;

public class LocalChoice extends LocalInteraction {

	private List<LocalInteraction> branches;
	private String choser;

	public LocalChoice(List<LocalInteraction> localBranches,String choser) {
		this.branches = localBranches;
		this.choser =choser;
	}

	public String prettyPrint(int indent) {
		String result = addIndent(indent)+"choice at "+ choser+ " {";
		Iterator<LocalInteraction> it = branches.iterator();
		result+=it.next().prettyPrint(indent+1);
		while (it.hasNext())
		{
			result+=addIndent(indent)+"} and {";
			result+=it.next().prettyPrint(indent+1);
		}
		result+=addIndent(indent)+"}";
		result+=this.following.prettyPrint(indent);
		return result;
	}

}
