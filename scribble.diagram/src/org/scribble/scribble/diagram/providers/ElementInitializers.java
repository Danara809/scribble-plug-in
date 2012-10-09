package org.scribble.scribble.diagram.providers;

import org.scribble.scribble.diagram.part.ScribbleDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ScribbleDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ScribbleDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
