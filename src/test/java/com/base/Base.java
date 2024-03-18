package com.base;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Report.ExtentReport;
import com.driverManager.Driver;




public class Base {
	

	@BeforeMethod
	public void browserInit() {
		
		Driver.initDriver();
	}
	
	
	@AfterMethod
	public void TearDown() {
		Driver.quitDriver();
		
	}
	


}
