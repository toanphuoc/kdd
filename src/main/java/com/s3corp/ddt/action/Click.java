package com.s3corp.ddt.action;

public class Click extends ActionBase{

	public Click(){
		type = "Click";
	}
	
	@Override
	public void perform(String[] args) {
		browser.click(args[0]);
	}

}
