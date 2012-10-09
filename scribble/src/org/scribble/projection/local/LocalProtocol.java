package org.scribble.projection.local;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocalProtocol {

	private String protocolName;
	private List<String> roles;
	private List<String> parameters;
	private String projectedRole;
	private LocalInteraction body;
	
	public LocalProtocol(){
		roles = new ArrayList<String>();
		parameters = new ArrayList<String>();
	}

	public String prettyPrint() {
		String result= "local protocol ";
		result+=protocolName;
		result+=printParameters();
		result+=printRoles();
		result+="{";
		result+=body.prettyPrint(1);
		result+="\n}\n";
		return result;
	}

	private String printRoles() {
		String result = "";
		if (roles.size()>0){
			result+=" (";
			Iterator<String> itRoles=roles.iterator();
			result+=printRole(itRoles.next());
			while(itRoles.hasNext()){
				result+=", "+printRole(itRoles.next());
			}
			result+=")";
		}
		return result;
	}

	private String printRole(String role) {
		if(role==projectedRole)
			return "self "+role;
		else
			return "role "+role;
	}

	private String printParameters() {
		String result = "";
		if (parameters.size()>0){
			result+=" <";
			Iterator<String> itParams=parameters.iterator();
			result+="sig "+itParams.next();
			while(itParams.hasNext()){
				result+=", sig "+itParams.next();
			}
			result+=">";
		}
		return result;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;		
	}

	public void setRoles(List<String> roles) {
		this.roles =roles;
	}
	
	public void setProjectedRole(String role){
		this.projectedRole = role;
	}
	
	public void setParameters(List<String> parameters){
		this.parameters = parameters;
	}

	public void setBody(LocalInteraction localInteraction) {
		this.body = localInteraction;
	}

	public String getName() {
		return protocolName;
	}
	
}
