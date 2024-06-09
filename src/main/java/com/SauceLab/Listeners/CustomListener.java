 package com.SauceLab.Listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sauce.utility.Utility;



public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Starts : " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed : " + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed !!!!! Taking Screenshot : " + result.getMethod().getMethodName());
		Utility.takeFailedTestScreenShot(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
