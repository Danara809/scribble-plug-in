package org.scribble.scribble.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry;

/**
 * @generated
 */
public class ScribbleEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ScribbleVisualIDRegistry.getVisualID(view)) {

			case ScribbleProgramEditPart.VISUAL_ID:
				return new ScribbleProgramEditPart(view);

			case InstGlobalProtocolDeclEditPart.VISUAL_ID:
				return new InstGlobalProtocolDeclEditPart(view);

			case InstGlobalProtocolDeclProtocolNameEditPart.VISUAL_ID:
				return new InstGlobalProtocolDeclProtocolNameEditPart(view);

			case IncludeDeclEditPart.VISUAL_ID:
				return new IncludeDeclEditPart(view);

			case IncludeDeclImportURIEditPart.VISUAL_ID:
				return new IncludeDeclImportURIEditPart(view);

			case TypeDeclEditPart.VISUAL_ID:
				return new TypeDeclEditPart(view);

			case TypeDeclTypeNameEditPart.VISUAL_ID:
				return new TypeDeclTypeNameEditPart(view);

			case GlobalProtocolDeclEditPart.VISUAL_ID:
				return new GlobalProtocolDeclEditPart(view);

			case GlobalProtocolDeclProtocolNameEditPart.VISUAL_ID:
				return new GlobalProtocolDeclProtocolNameEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
