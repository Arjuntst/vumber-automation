package com.admin.reports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.admin.utility.ReusableFunction;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport extends ReusableFunction
{
	
	 
	 @BeforeTest
	 public void setExtent() {
	  // specify location of the report
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"./reports/ExtentReport.html");

	  htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
	  htmlReporter.config().setReportName("Vumber Web Automation Test Report"); // Name of the report
	  htmlReporter.config().setTheme(Theme.DARK);
	  
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	  // Passing General information
	 
	  extent.setSystemInfo("Host name", "Thapovan Info System");
	  extent.setSystemInfo("Environemnt", "QA");
	  extent.setSystemInfo("User", "Rahul");
	  extent.setSystemInfo("Application Version", "Admin");
	  extent.setSystemInfo("Type of Testing", "Regression Testing");
	 }
	 
	 @AfterTest
	 public void endReport() throws InterruptedException {
	  extent.flush();
	  Thread.sleep(2000);
	  //driver.quit();
	 }
	 
	 @AfterSuite
	 public void viewExtentReport() throws Exception {
	  extent.flush();
	  Thread.sleep(2000);
	// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "D:\\tools\\chrome diver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(System.getProperty("user.dir") + "/reports/ExtentReport.html");	 
    
	 Thread.sleep(4000);
	// driver.quit();
	 }
	 
	 public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  
		  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		  String destination = "./reports/Screenshots/" + screenshotName + dateName + ".png";
		  File finalDestination = new File(destination);
		  FileUtils.copyFile(source, finalDestination);
		  return destination;
		 }
	
	
}
