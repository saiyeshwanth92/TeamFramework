package com.vedhaframework.Constants;

import com.vedhaframework.Commonutils.CommonUtils;

public class Constants {
	
	public static final String TestData_Path = System.getProperty("user.dir")
			+ "/src/main/resources/TestData.properties";

	public static final String LoggersPath = "./src/main/resources/log4j.properties";

	public static final String TestReportsPath = System.getProperty("user.dir") + "/VedhaTestReports"+CommonUtils.getCurrentDate() + ".html";

	public static final String Loggers = System.getProperty("user.dir") + "./src/main/resources/log4j.properties";
	
	public static final int LONG_WAIT = 10000;
	
	
	public static String SauceDemo_URL = "https://www.saucedemo.com/v1/"; 

}