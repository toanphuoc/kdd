package com.s3corp.ddt.common;

import java.util.Hashtable;

import com.s3corp.ddt.action.ActionBase;
import com.s3corp.ddt.action.Click;
import com.s3corp.ddt.action.CloseBrowser;
import com.s3corp.ddt.action.OpenBrowser;
import com.s3corp.ddt.action.SendText;

public class ActionCache {

	private static Hashtable<String, ActionBase> actionMap = new Hashtable<String, ActionBase>();
	
	public static ActionBase getActionBase(String actionId){
		ActionBase actionBase = actionMap.get(actionId);
		return (ActionBase) actionBase.clone();
	}
	
	public static void loadAction(){
		Click click = new Click();
		click.setId("CLICK");
		actionMap.put(click.getId(), click);
		
		SendText sendText = new SendText();
		sendText.setId("SEND_Text");
		actionMap.put(sendText.getId(), sendText);
		
		OpenBrowser openBrowser = new OpenBrowser();
		openBrowser.setId("OPEN_Browser");
		actionMap.put(openBrowser.getId(), openBrowser);
		
		CloseBrowser closeBrowser = new CloseBrowser();
		closeBrowser.setId("CLOSE_Browser");
		actionMap.put(closeBrowser.getId(), closeBrowser);
	}
}
