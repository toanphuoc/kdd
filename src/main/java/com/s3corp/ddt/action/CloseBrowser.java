package com.s3corp.ddt.action;

public class CloseBrowser extends ActionBase{

	@Override
	public void perform(String[] args) {
		browser.closeBrowser();
	}

}
