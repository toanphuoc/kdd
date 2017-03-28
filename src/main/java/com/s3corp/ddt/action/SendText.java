package com.s3corp.ddt.action;

public class SendText extends ActionBase{

	public SendText() {
		type = "SEND_Text";
	}
	
	@Override
	public void perform(String[] args) {
		System.out.println("Sending text.");
	}
}
