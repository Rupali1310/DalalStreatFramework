package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Execution started");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution completed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution failed");
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
