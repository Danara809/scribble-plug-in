package org.scribble.scribble.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.scribble.scribble.GlobalProtocolDecl;
import org.scribble.scribble.IncludeDecl;
import org.scribble.scribble.InstGlobalProtocolDecl;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.TypeDecl;
import org.scribble.scribble.diagram.edit.parts.GlobalProtocolDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.IncludeDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.InstGlobalProtocolDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.ScribbleProgramEditPart;
import org.scribble.scribble.diagram.edit.parts.TypeDeclEditPart;

/**
 * @generated
 */
public class ScribbleDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ScribbleNodeDescriptor> getSemanticChildren(View view) {
		switch (ScribbleVisualIDRegistry.getVisualID(view)) {
		case ScribbleProgramEditPart.VISUAL_ID:
			return getScribbleProgram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleNodeDescriptor> getScribbleProgram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ScribbleProgram modelElement = (ScribbleProgram) view.getElement();
		LinkedList<ScribbleNodeDescriptor> result = new LinkedList<ScribbleNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInstGlobalProtocolDecl()
				.iterator(); it.hasNext();) {
			InstGlobalProtocolDecl childElement = (InstGlobalProtocolDecl) it
					.next();
			int visualID = ScribbleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InstGlobalProtocolDeclEditPart.VISUAL_ID) {
				result.add(new ScribbleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIncludeDecl().iterator(); it
				.hasNext();) {
			IncludeDecl childElement = (IncludeDecl) it.next();
			int visualID = ScribbleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IncludeDeclEditPart.VISUAL_ID) {
				result.add(new ScribbleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTypeDecl().iterator(); it
				.hasNext();) {
			TypeDecl childElement = (TypeDecl) it.next();
			int visualID = ScribbleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeDeclEditPart.VISUAL_ID) {
				result.add(new ScribbleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGlobalProtocolDecl().iterator(); it
				.hasNext();) {
			GlobalProtocolDecl childElement = (GlobalProtocolDecl) it.next();
			int visualID = ScribbleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GlobalProtocolDeclEditPart.VISUAL_ID) {
				result.add(new ScribbleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getContainedLinks(View view) {
		switch (ScribbleVisualIDRegistry.getVisualID(view)) {
		case ScribbleProgramEditPart.VISUAL_ID:
			return getScribbleProgram_1000ContainedLinks(view);
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
			return getInstGlobalProtocolDecl_2003ContainedLinks(view);
		case IncludeDeclEditPart.VISUAL_ID:
			return getIncludeDecl_2004ContainedLinks(view);
		case TypeDeclEditPart.VISUAL_ID:
			return getTypeDecl_2001ContainedLinks(view);
		case GlobalProtocolDeclEditPart.VISUAL_ID:
			return getGlobalProtocolDecl_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getIncomingLinks(View view) {
		switch (ScribbleVisualIDRegistry.getVisualID(view)) {
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
			return getInstGlobalProtocolDecl_2003IncomingLinks(view);
		case IncludeDeclEditPart.VISUAL_ID:
			return getIncludeDecl_2004IncomingLinks(view);
		case TypeDeclEditPart.VISUAL_ID:
			return getTypeDecl_2001IncomingLinks(view);
		case GlobalProtocolDeclEditPart.VISUAL_ID:
			return getGlobalProtocolDecl_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getOutgoingLinks(View view) {
		switch (ScribbleVisualIDRegistry.getVisualID(view)) {
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
			return getInstGlobalProtocolDecl_2003OutgoingLinks(view);
		case IncludeDeclEditPart.VISUAL_ID:
			return getIncludeDecl_2004OutgoingLinks(view);
		case TypeDeclEditPart.VISUAL_ID:
			return getTypeDecl_2001OutgoingLinks(view);
		case GlobalProtocolDeclEditPart.VISUAL_ID:
			return getGlobalProtocolDecl_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getScribbleProgram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getInstGlobalProtocolDecl_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getIncludeDecl_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getTypeDecl_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getGlobalProtocolDecl_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getInstGlobalProtocolDecl_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getIncludeDecl_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getTypeDecl_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getGlobalProtocolDecl_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getInstGlobalProtocolDecl_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getIncludeDecl_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getTypeDecl_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScribbleLinkDescriptor> getGlobalProtocolDecl_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ScribbleNodeDescriptor> getSemanticChildren(View view) {
			return ScribbleDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ScribbleLinkDescriptor> getContainedLinks(View view) {
			return ScribbleDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ScribbleLinkDescriptor> getIncomingLinks(View view) {
			return ScribbleDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ScribbleLinkDescriptor> getOutgoingLinks(View view) {
			return ScribbleDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
