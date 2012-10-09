package org.scribble.scribble.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.diagram.edit.parts.GlobalProtocolDeclProtocolNameEditPart;
import org.scribble.scribble.diagram.edit.parts.IncludeDeclImportURIEditPart;
import org.scribble.scribble.diagram.edit.parts.InstGlobalProtocolDeclProtocolNameEditPart;
import org.scribble.scribble.diagram.edit.parts.TypeDeclTypeNameEditPart;
import org.scribble.scribble.diagram.parsers.MessageFormatParser;
import org.scribble.scribble.diagram.part.ScribbleVisualIDRegistry;

/**
 * @generated
 */
public class ScribbleParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser instGlobalProtocolDeclProtocolName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInstGlobalProtocolDeclProtocolName_5003Parser() {
		if (instGlobalProtocolDeclProtocolName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ScribblePackage.eINSTANCE
					.getInstGlobalProtocolDecl_ProtocolName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			instGlobalProtocolDeclProtocolName_5003Parser = parser;
		}
		return instGlobalProtocolDeclProtocolName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser includeDeclImportURI_5004Parser;

	/**
	 * @generated
	 */
	private IParser getIncludeDeclImportURI_5004Parser() {
		if (includeDeclImportURI_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ScribblePackage.eINSTANCE
					.getIncludeDecl_ImportURI() };
			MessageFormatParser parser = new MessageFormatParser(features);
			includeDeclImportURI_5004Parser = parser;
		}
		return includeDeclImportURI_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeDeclTypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTypeDeclTypeName_5001Parser() {
		if (typeDeclTypeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ScribblePackage.eINSTANCE
					.getTypeDecl_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeDeclTypeName_5001Parser = parser;
		}
		return typeDeclTypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser globalProtocolDeclProtocolName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getGlobalProtocolDeclProtocolName_5002Parser() {
		if (globalProtocolDeclProtocolName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ScribblePackage.eINSTANCE
					.getGlobalProtocolDecl_ProtocolName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			globalProtocolDeclProtocolName_5002Parser = parser;
		}
		return globalProtocolDeclProtocolName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InstGlobalProtocolDeclProtocolNameEditPart.VISUAL_ID:
			return getInstGlobalProtocolDeclProtocolName_5003Parser();
		case IncludeDeclImportURIEditPart.VISUAL_ID:
			return getIncludeDeclImportURI_5004Parser();
		case TypeDeclTypeNameEditPart.VISUAL_ID:
			return getTypeDeclTypeName_5001Parser();
		case GlobalProtocolDeclProtocolNameEditPart.VISUAL_ID:
			return getGlobalProtocolDeclProtocolName_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ScribbleVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ScribbleVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ScribbleElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
