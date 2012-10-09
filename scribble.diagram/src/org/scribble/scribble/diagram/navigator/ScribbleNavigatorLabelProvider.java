package org.scribble.scribble.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.scribble.scribble.diagram.edit.parts.GlobalProtocolDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.GlobalProtocolDeclProtocolNameEditPart;
import org.scribble.scribble.diagram.edit.parts.IncludeDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.IncludeDeclImportURIEditPart;
import org.scribble.scribble.diagram.edit.parts.InstGlobalProtocolDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.InstGlobalProtocolDeclProtocolNameEditPart;
import org.scribble.scribble.diagram.edit.parts.ScribbleProgramEditPart;
import org.scribble.scribble.diagram.edit.parts.TypeDeclEditPart;
import org.scribble.scribble.diagram.edit.parts.TypeDeclTypeNameEditPart;
import org.scribble.scribble.diagram.part.ScribbleDiagramEditorPlugin;
import org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry;
import org.scribble.scribble.diagram.providers.ScribbleElementTypes;
import org.scribble.scribble.diagram.providers.ScribbleParserProvider;

/**
 * @generated
 */
public class ScribbleNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ScribbleDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ScribbleDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ScribbleNavigatorItem
				&& !isOwnView(((ScribbleNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ScribbleNavigatorGroup) {
			ScribbleNavigatorGroup group = (ScribbleNavigatorGroup) element;
			return ScribbleDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ScribbleNavigatorItem) {
			ScribbleNavigatorItem navigatorItem = (ScribbleNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ScribbleVisualIDRegistry.getVisualID(view)) {
		case ScribbleProgramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.scribble.org/Scribble?ScribbleProgram", ScribbleElementTypes.ScribbleProgram_1000); //$NON-NLS-1$
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.scribble.org/Scribble?InstGlobalProtocolDecl", ScribbleElementTypes.InstGlobalProtocolDecl_2003); //$NON-NLS-1$
		case IncludeDeclEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.scribble.org/Scribble?IncludeDecl", ScribbleElementTypes.IncludeDecl_2004); //$NON-NLS-1$
		case TypeDeclEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.scribble.org/Scribble?TypeDecl", ScribbleElementTypes.TypeDecl_2001); //$NON-NLS-1$
		case GlobalProtocolDeclEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.scribble.org/Scribble?GlobalProtocolDecl", ScribbleElementTypes.GlobalProtocolDecl_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ScribbleDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ScribbleElementTypes.isKnownElementType(elementType)) {
			image = ScribbleElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ScribbleNavigatorGroup) {
			ScribbleNavigatorGroup group = (ScribbleNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ScribbleNavigatorItem) {
			ScribbleNavigatorItem navigatorItem = (ScribbleNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ScribbleVisualIDRegistry.getVisualID(view)) {
		case ScribbleProgramEditPart.VISUAL_ID:
			return getScribbleProgram_1000Text(view);
		case InstGlobalProtocolDeclEditPart.VISUAL_ID:
			return getInstGlobalProtocolDecl_2003Text(view);
		case IncludeDeclEditPart.VISUAL_ID:
			return getIncludeDecl_2004Text(view);
		case TypeDeclEditPart.VISUAL_ID:
			return getTypeDecl_2001Text(view);
		case GlobalProtocolDeclEditPart.VISUAL_ID:
			return getGlobalProtocolDecl_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getScribbleProgram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInstGlobalProtocolDecl_2003Text(View view) {
		IParser parser = ScribbleParserProvider
				.getParser(
						ScribbleElementTypes.InstGlobalProtocolDecl_2003,
						view.getElement() != null ? view.getElement() : view,
						ScribbleVisualIDRegistry
								.getType(InstGlobalProtocolDeclProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScribbleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIncludeDecl_2004Text(View view) {
		IParser parser = ScribbleParserProvider.getParser(
				ScribbleElementTypes.IncludeDecl_2004,
				view.getElement() != null ? view.getElement() : view,
				ScribbleVisualIDRegistry
						.getType(IncludeDeclImportURIEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScribbleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeDecl_2001Text(View view) {
		IParser parser = ScribbleParserProvider.getParser(
				ScribbleElementTypes.TypeDecl_2001,
				view.getElement() != null ? view.getElement() : view,
				ScribbleVisualIDRegistry
						.getType(TypeDeclTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScribbleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGlobalProtocolDecl_2002Text(View view) {
		IParser parser = ScribbleParserProvider
				.getParser(
						ScribbleElementTypes.GlobalProtocolDecl_2002,
						view.getElement() != null ? view.getElement() : view,
						ScribbleVisualIDRegistry
								.getType(GlobalProtocolDeclProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScribbleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ScribbleProgramEditPart.MODEL_ID.equals(ScribbleVisualIDRegistry
				.getModelID(view));
	}

}
