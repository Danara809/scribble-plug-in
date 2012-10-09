package org.scribble.projection.local;

import java.util.Iterator;
import java.util.List;

public class LocalParallel extends LocalInteraction {

	private List<LocalInteraction> branches;

	public LocalParallel(List<LocalInteraction> localBranches) {
		this.branches = localBranches;
	}

	
	public String prettyPrint(int indent) {
		String result = addIndent(indent)+"parallel{";
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
