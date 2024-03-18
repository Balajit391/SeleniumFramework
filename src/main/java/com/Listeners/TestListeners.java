package com.Listeners;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.Report.ExtentLog;
import com.Report.ExtentReport;

@Listeners
public class TestListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTestCaseName(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentLog.Pass(result.getName() + " is Pass");
	}
	@Override
	public  void onTestFailure(ITestResult result) {
		ExtentLog.Fail(result.getName() + " is Fail");
		ExtentLog.Fail(result.getThrowable().getMessage());
		ExtentLog.Fail(Arrays.toString(result.getThrowable().getStackTrace()));
	}
	@Override
	public  void onTestSkipped(ITestResult result) {
		ExtentLog.Fail(result.getName() + " is Skipped");
	}
	@Override
	public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}
	@Override
	public  void onTestFailedWithTimeout(ITestResult result) {
		//onTestFailure(result);
	}
	@Override
	public  void onStart(ITestContext context) {
		ExtentReport.initReport();
		
	}
	@Override
	public  void onFinish(ITestContext context) {
		ExtentReport.flushReports();
		
	}

}
