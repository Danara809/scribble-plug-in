package org.scribble.scribble.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.scribble.scribble.diagram.providers.ScribbleElementTypes;

/**
 * @generated
 */
public class ScribblePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createScribble1Group());
	}

	/**
	 * Creates "scribble" palette tool group
	 * @generated
	 */
	private PaletteContainer createScribble1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Scribble1Group_title);
		paletteContainer.setId("createScribble1Group"); //$NON-NLS-1$
		paletteContainer.add(createScribbleProgram1CreationTool());
		paletteContainer.add(createScribbleProgramIncludeDecl2CreationTool());
		paletteContainer.add(createScribbleProgramTypeDecl3CreationTool());
		paletteContainer
				.add(createScribbleProgramGlobalProtocolDecl4CreationTool());
		paletteContainer.add(createIncludeDecl5CreationTool());
		paletteContainer.add(createTypeDecl6CreationTool());
		paletteContainer.add(createGlobalProtocolDecl7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScribbleProgram1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScribbleProgram1CreationTool_title,
				Messages.ScribbleProgram1CreationTool_desc,
				Collections
						.singletonList(ScribbleElementTypes.InstGlobalProtocolDecl_2003));
		entry.setId("createScribbleProgram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScribbleElementTypes
				.getImageDescriptor(ScribbleElementTypes.InstGlobalProtocolDecl_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScribbleProgramIncludeDecl2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScribbleProgramIncludeDecl2CreationTool_title,
				Messages.ScribbleProgramIncludeDecl2CreationTool_desc,
				Collections
						.singletonList(ScribbleElementTypes.IncludeDecl_2004));
		entry.setId("createScribbleProgramIncludeDecl2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScribbleElementTypes
				.getImageDescriptor(ScribbleElementTypes.IncludeDecl_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScribbleProgramTypeDecl3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScribbleProgramTypeDecl3CreationTool_title,
				Messages.ScribbleProgramTypeDecl3CreationTool_desc,
				Collections.singletonList(ScribbleElementTypes.TypeDecl_2001));
		entry.setId("createScribbleProgramTypeDecl3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScribbleElementTypes
				.getImageDescriptor(ScribbleElementTypes.TypeDecl_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScribbleProgramGlobalProtocolDecl4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScribbleProgramGlobalProtocolDecl4CreationTool_title,
				Messages.ScribbleProgramGlobalProtocolDecl4CreationTool_desc,
				Collections
						.singletonList(ScribbleElementTypes.GlobalProtocolDecl_2002));
		entry.setId("createScribbleProgramGlobalProtocolDecl4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScribbleElementTypes
				.getImageDescriptor(ScribbleElementTypes.GlobalProtocolDecl_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncludeDecl5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.IncludeDecl5CreationTool_title,
				Messages.IncludeDecl5CreationTool_desc, null, null) {
		};
		entry.setId("createIncludeDecl5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeDecl6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TypeDecl6CreationTool_title,
				Messages.TypeDecl6CreationTool_desc, null, null) {
		};
		entry.setId("createTypeDecl6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlobalProtocolDecl7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GlobalProtocolDecl7CreationTool_title,
				Messages.GlobalProtocolDecl7CreationTool_desc, null, null) {
		};
		entry.setId("createGlobalProtocolDecl7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
