package com.duobed.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.duobed.TestBase.TestBase;

public class ListenerSetUp  extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		logger.info("Test case execution started");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Test case execution completed");

	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		logger.info("Test case execution failed");
        UtilClass.takesScreenshot(result.getName()+System.currentTimeMillis());
        logger.info("Screenshot taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger.info("Test case execution skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

}
