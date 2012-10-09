package org.scribble.projection.local;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LocalProgram {
	
	private String projectedRole;
	private List<String> includes;
	private List<LocalTypeDecl> typeDecl;
	private  List<LocalProtocol> localProtocols;
	private File srcGenDirectory;

	public LocalProgram(File srcGenDirectory, String role)
	{
		this.srcGenDirectory = srcGenDirectory;
		this.projectedRole = role;
		this.localProtocols = new ArrayList<LocalProtocol>();
	}

	public void setIncludes(List<String> resultInclude) {
		this.includes = resultInclude;
	}

	public void setTypeDecl(List<LocalTypeDecl> resultType) {
		this.typeDecl = resultType;
	}

	public void addLocalProtocol(LocalProtocol lpd) {
		this.localProtocols.add(lpd);
	}

	public void save() {
		//Create a new file
		File localProjFile = new File(srcGenDirectory.getAbsolutePath().replaceAll(".spr", "")+"@"+projectedRole+".spr");
		try {
			if(!localProjFile.exists()) {
				localProjFile.createNewFile();
			} 
			FileWriter fileWriter = new FileWriter(localProjFile);
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write(prettyPrint());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String prettyPrint() {
		String result = "";
		result+= printIncludes()+"\n";
		result+= printTypesDecl()+"\n";
		result+= printLocalProtocols()+"\n";
		return result;
	}

	private String printLocalProtocols() {
		String result = "";
		Iterator<LocalProtocol> it = localProtocols.iterator();
		while(it.hasNext()){
			result+=(it.next().prettyPrint()+"\n");
		}
		return result;
	}

	private String printTypesDecl() {
		String result = "";
		Iterator<LocalTypeDecl> it = typeDecl.iterator();
		while(it.hasNext()){
			result+=(it.next().prettyPrint()+"\n");
		}
		return result;
	}

	private String printIncludes(){
		String result = "";
		Iterator<String> it = includes.iterator();
		while(it.hasNext()){
			result+=("include " + it.next() + ";\n");
		}
		return result;
	}

	public boolean hasProtocol(String localName) {
		Iterator<LocalProtocol> it = localProtocols.iterator();
		while(it.hasNext()){
			if (it.next().getName()==localName){
				return true;
			}
		}
		return false;
	}

}
