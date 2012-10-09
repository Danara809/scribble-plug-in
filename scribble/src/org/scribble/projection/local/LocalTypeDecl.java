package org.scribble.projection.local;

public class LocalTypeDecl {

	private String schema;
	private String typeName;
	private String file;
	private String alias;

	public LocalTypeDecl(String typeName, String schema, String file,String alias) {
		this.typeName = typeName;
		this.schema = schema;
		this.file=file;
		this.alias=alias;
	}

	public String prettyPrint() {
		String result="import ";
		result+=typeName;
		result+=" from <"+schema+">";
		result+=" "+file;
		if (alias!=null)
				result+=" as "+alias+";";
		else
			result+=";";
		return result;
	}

}
