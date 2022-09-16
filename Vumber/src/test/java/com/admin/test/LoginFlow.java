package com.admin.test;

import java.net.MalformedURLException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.implementation.LoginScreen;
import com.admin.reports.Base;


public class LoginFlow extends Base
{
	
	public Boolean urlIntialisation=false;	
	 

	@BeforeMethod
	public void LaunchUrl() throws Exception
	{
		if(!urlIntialisation)
		{
			LoginFlow.setup();
			urlIntialisation=true;
		}
	}
	
//	 public static void seleniumGridSetup() throws MalformedURLException, InterruptedException {
//		
//		 String url="https://qa-practitioner.reimbursify.com/login";
//		 DesiredCapabilities cap = DesiredCapabilities.chrome();
//		 cap.setBrowserName("chrome");
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
	 @Test(priority=6)
		public static  void ValidCredentials() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionality");
			  LoginScreen.Login();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	 
	  
	 @Test(priority=0)
		public static  void EmptyCredentials() throws Exception
		{
		      
			  test = extent.createTest("Verify the login fuctionality without data");
			  LoginScreen.CredentialEmpty();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	 @Test(priority=1)
		public static  void InvalidCredentialsBoth() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionality with invalid credential");
			  LoginScreen.InvalidCredentialBoth();
			  Thread.sleep(2000);
			  
		}
	 
	 @Test(priority=2)
		public static  void InvalidEmailValidPass() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionality with Invalid Email Valid Password");
			  LoginScreen.InvalidEmailValidPass();
			  Thread.sleep(2000);
			  
		}
	 @Test(priority=3)
		public static  void ValidEmailInvalidPass() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionalityn with valid Email InValid Password");
			  LoginScreen.ValidEmailInValidPass();
			  Thread.sleep(2000);
			  
		}
	 @Test(priority=4)
		public static  void EmptyMailvalidpassword() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionality with Empty Email Valid Password");
			  LoginScreen.EmptyMailvalidpassword();
			  Thread.sleep(2000);
			  
		}
	 @Test(priority=5)
		public static  void ValidMailEmptydpassword() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionality with Valid Email Empty Password");
			  LoginScreen.ValidMailEmptydpassword();
			  Thread.sleep(3000);
			  
		}
	 @Test(priority=10)
		public static  void Rememberme() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("login with Remember me enabled");
			  LoginScreen.loginbyrememberme();
			  Thread.sleep(2000);
			  
		}
	 @Test(priority=7)
		public static  void learnmore() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the functionality of learnmore button");
			  LoginScreen.learnmore();
			  Thread.sleep(2000);
		}
	 @Test(priority=8)
		public static  void infoicon() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the functionality of infoicon button");
			  LoginScreen.infoicon();
			  Thread.sleep(2000);
		}
	 @Test(priority=9)
		public static  void closeinfoicon() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the functionality of closeinfoicon button");
			  LoginScreen.closeoninfoicon();
			  Thread.sleep(2000);
		}
	 @Test(priority=11)
		public static  void logout() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("logout");
			  LoginScreen.logout();
			  Thread.sleep(2000);
		}
		
	 @Test(priority=12)
		public static void legacydashboard() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the functionality of legacy dashboard button ");
			  LoginScreen.legacydashboard();
			  Thread.sleep(2000);
		}
	 @Test(priority=13)
		public static void Forgotpassword() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the functionality of Forgotpassword  button ");
			  LoginScreen.Forgotpassword();
			  Thread.sleep(2000);
		}
}
	 




	 


