package com.dataio;

public final class FrameworkConstants {

	private FrameworkConstants() {}
	
	private final static String EXTENTREPORT_PATH =System.getProperty("user.dir")+"/ExtentReport/Index.html";
	private final static String SANITY_TEST ="Sanity";
	private final static String REGRESSION_TEST ="Regression";
	
	public static String getSanityTest() {
		return SANITY_TEST;
	}

	public static String getRegressionTest() {
		return REGRESSION_TEST;
	}
	
	public static String getExtenReportPath() {
		
		return EXTENTREPORT_PATH;
	}
	
	
}
