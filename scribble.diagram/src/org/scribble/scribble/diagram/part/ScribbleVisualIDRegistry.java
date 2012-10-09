package org.scribble.scribble.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.diagram.edit.parts.GlobalProtocolDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.GlobalProtocolDeclProtocolNameEditPart;
import org.scribble.scribble.diagram.edit.parts.IncludeDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.IncludeDeclImportURIEditPart;
import org.scribble.scribble.diagram.edit.parts.InstGlobalProtocolDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.InstGlobalProtocolDeclProtocolNameEditPart;
import org.scribble.scribble.diagram.edit.parts.ScribbleProgramEditPart;
import org.scribble.scribble.diagram.edit.parts.TypeDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.TypeDeclTypeNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ScribbleVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "scribble.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ScribbleProgramEditPart.MODEL_ID.equals(view.getType())) {
				return ScribbleProgramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ScribbleDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ScribblePackage.eINSTANCE.getScribbleProgram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ScribbleProgram) domainElement)) {
			return ScribbleProgramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
				.getModelID(containerView);
		if (!ScribbleProgramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ScribbleProgramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ScribbleProgramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ScribbleProgramEditPart.VISUAL_ID:
			if (ScribblePackage.eINSTANCE.getInstGlobalProtocolDecl()
					.isSuperTypeOf(domainElement.eClass())) {
				return InstGlobalProtocolDeclEditPart.VISUAL_ID;
			}
			if (ScribblePackage.eINSTANCE.getIncludeDecl().isSuperTypeOf(
					domainElement.eClass())) {
				return IncludeDeclEditPart.VISUAL_ID;
			}
			if (ScribblePackage.eINSTANCE.getTypeDecl().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeDeclEditPart.VISUAL_ID;
			}
			if (ScribblePackage.eINSTANCE.getGlobalProtocolDecl()
					.isSuperTypeOf(domainElement.eClass())) {
				return GlobalProtocolDeclEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
				.getModelID(containerView);
		if (!ScribbleProgramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ScribbleProgramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ScribbleProgramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ScribbleProgramEditPart.VISUAL_ID:
			if (InstGlobalProtocolDeclEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IncludeDeclEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeDeclEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GlobalProtocolDeclEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
			if (InstGlobalProtocolDeclProtocolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IncludeDeclEditPart.VISUAL_ID:
			if (IncludeDeclImportURIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeDeclEditPart.VISUAL_ID:
			if (TypeDeclTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GlobalProtocolDeclEditPart.VISUAL_ID:
			if (GlobalProtocolDeclProtocolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ScribbleProgram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ScribbleProgramEditPart.VISUAL_ID:
			return false;
		case TypeDeclEditPart.VISUAL_ID:
		case GlobalProtocolDeclEditPart.VISUAL_ID:
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
		case IncludeDeclEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
