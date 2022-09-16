package com.admin.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.implementation.LoginScreen;
import com.admin.implementation.dashBoardScreen;
import com.admin.reports.Base;

public class dashBoardFlow extends Base {

	public boolean urlIntialisation=false;
	@BeforeMethod
	public void LaunchUrl() throws Exception
	{
		
		if(!urlIntialisation)
		{
			LoginFlow.setup();
			urlIntialisation=true;
		}
	}
	
	public static void setup() {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chrome vrsn\\103\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://qa-admin.reimbursify.com/");
		  
		 }
	@Test(priority=0)
	public static  void ValidCredentials() throws Exception
	{
	      driver.get(driver.getCurrentUrl());
		  test = extent.createTest("Verify the login fuctionality");
		  LoginScreen.Login();
		  Thread.sleep(2000);
		  //driver.get(driver.getCurrentUrl());
		
	}
		 
	 @Test(priority = 1)
		 
		 public static void checkViewIcon()  throws Exception{
			 driver.get(driver.getCurrentUrl());
			 test = extent.createTest("Verify The View icon");
			 dashBoardScreen.verifyViewIcon();
		 }
		 
		 
}
