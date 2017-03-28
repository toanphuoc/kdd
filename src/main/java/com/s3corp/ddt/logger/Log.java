package com.s3corp.ddt.logger;

import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void debug(String message){
		Log.debug(message);
	}
}
