package com.admin.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.implementation.LoginScreen;
import com.admin.reports.Base;

public class forgotpasswordflow extends Base
{
	
	public Boolean urlIntialisation=false;
	
	@BeforeMethod
	public void LaunchUrl() throws Exception
	{
		if(!urlIntialisation)
		{
			forgotpasswordflow.setup();
			urlIntialisation=true;
		}
	}

	
		

//		 cap.setPlatform(Platform.LINUX);
//		 System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\drivers\\chromedriver_win32(2)\\chromedriver.exe");
//	     driver.get(url);	
//		 }
	

	 public static void setup() {
	
	  System.setProperty("webdriver.chrome.driver", "D:\\tools\\chrome diver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://app.vumber.com/login./");
	 }
	 
	 
	 @Test(priority=0)
		public static  void forgotpassword() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("verify the forgotpassword functionality");
			 // forgotpassword.forgotpassword();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	}


