package com.admin.reports;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base extends ExtentReport
{
	
	String concatenate=".";
	
	 @AfterMethod
	 public void tearDown(ITestResult result) throws IOException {
		 
	  if (result.getStatus() == ITestResult.FAILURE) {
	   test.log(Status.FAIL, "TEST CASE FAILED: " + result.getName()); // to add name in extent report
	   test.log(Status.FAIL, "TEST CASE FAILED: " + result.getThrowable()); // to add error/exception in extent report
	   String screenshotPath = concatenate+ExtentReport.getScreenshot(driver, result.getName());
	   test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
	  } else if (result.getStatus() == ITestResult.SKIP) {
	   test.log(Status.SKIP, "TEST CASE SKIPPED: " + result.getName());
	   String screenshotPath = concatenate+ExtentReport.getScreenshot(driver, result.getName());
	   test.addScreenCaptureFromPath(screenshotPath);
	  }
	  else if (result.getStatus() == ITestResult.SUCCESS) {
		 
	   test.log(Status.PASS, "TEST CASE PASS: " + result.getName());
	   String screenshotPath = concatenate+ExtentReport.getScreenshot(driver, result.getName());
	   test.addScreenCaptureFromPath(screenshotPath);
	  }
	 // driver.quit();
	 }
	 
	



}
