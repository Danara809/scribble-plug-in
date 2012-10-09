package org.scribble.scribble.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry;

/**
 * @generated
 */
public class ScribbleNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 2006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ScribbleNavigatorItem) {
			ScribbleNavigatorItem item = (ScribbleNavigatorItem) element;
			return ScribbleVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
