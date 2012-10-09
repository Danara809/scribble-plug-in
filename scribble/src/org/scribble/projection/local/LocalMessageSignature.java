package org.scribble.projection.local;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LocalMessageSignature {

	private List<LocalPayLoadType> payloadTypes;
	private String operator;
	
	public LocalMessageSignature(){
		payloadTypes = new ArrayList<LocalPayLoadType>();
	}

	public String prettyPrint() {
			String result ="";
			result+=operator+"(";
			Iterator<LocalPayLoadType> it = payloadTypes.iterator();
			if (it.hasNext())
				result+=it.next().prettyPrint();
			while(it.hasNext()){
				result+=", "+it.next().prettyPrint();
			}
			return result+")";		
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void addPayLoad(LocalPayLoadType localPayLoadType) {
		this.payloadTypes.add(localPayLoadType);	
	}

}
