package com.s3corp.ddt.action;

public class OpenBrowser extends ActionBase{

	@Override
	public void perform(String[] args) {
		browser.openBrowser(args[0], args[1]);
	}
}
