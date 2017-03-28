package com.s3corp.ddt.action;

import com.s3corp.ddt.core.Browser;
import com.s3corp.ddt.core.BrowserImpl;

public abstract class ActionBase implements Cloneable{

	private String id;
	protected String type;
	
	protected Browser browser = BrowserImpl.getIntancse();
	
	public abstract void perform(String[] args);
	
	public String getId(){
		return id;
	}
	
	public String getType(){
		return type;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public Object clone(){
		Object clone = null;
	    try {
	        clone = super.clone();
	    } catch (CloneNotSupportedException e) {
	        e.printStackTrace();
	    }
	      
	    return clone;
	}
}
