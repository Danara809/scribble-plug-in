package org.scribble.projection.local;

public class LocalPayLoadType {

	private String payLoad;
	private String data;
	
	public LocalPayLoadType(String payLoad,String data){
		this.payLoad=payLoad;
		this.data=data;
	}

	public String prettyPrint() {
		String result = payLoad;
		if(data!=null)
				result+=" "+data;
		return result;
	}

}
