package com.s3corp.ddt.common;

import com.s3corp.ddt.action.ActionBase;
import com.s3corp.ddt.logger.Log;

public class Common {

	public static void main(String[] args) {
		ActionCache.loadAction();
		
//		ActionBase  cloneClick = ActionCache.getActionBase("CLICK");
//		cloneClick.perform(new String[]{"s", "s1"});
//		
//		ActionBase  cloneSendText = ActionCache.getActionBase("SEND_Text");
//		cloneSendText.perform(new String[]{"s", "s1"});

		ActionBase openBrowser = ActionCache.getActionBase("OPEN_Browser");
		openBrowser.perform(new String[]{"chrome", "https://google.com"});
//		
//		openBrowser.perform(new String[]{"FIREFOX", "google.com"});
//		
//		openBrowser.perform(new String[]{"IE", "google.com"});
		
		ActionBase closeBrowser = ActionCache.getActionBase("CLOSE_Browser");
		closeBrowser.perform(new String[1]);
	}
}
