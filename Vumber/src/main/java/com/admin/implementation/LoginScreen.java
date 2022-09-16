package com.admin.implementation;

import java.util.concurrent.TimeUnit;

import com.admin.pageobjects.Object_repository;
import com.admin.repository.Config;
import com.admin.utility.ReusableFunction;



public class LoginScreen extends ReusableFunction{
	
	
	static ReusableFunction rf = new ReusableFunction();
	
	public static void CredentialEmpty() throws InterruptedException
	{
		rf.clickButton(driver, Object_repository.SubmitButton);
        Thread.sleep(3000);
		
	}
	public static void EmptyMailvalidpassword() throws InterruptedException
	{
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.password);
		rf.clickButton(driver, Object_repository.SubmitButton);
        Thread.sleep(3000);
		
	}
	public static void ValidMailEmptydpassword() throws InterruptedException
	{
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.email);
		rf.clickButton(driver, Object_repository.SubmitButton);
        Thread.sleep(3000);
		
	}
	public static void InvalidCredentialBoth() throws InterruptedException
	{
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ReusableFunction.scrolldown();
	
		
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.Incorrectemail);
		
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.Incorrectpassword);
		
		rf.clickButton(driver, Object_repository.SubmitButton);

		
		Thread.sleep(3000);
		
	}
	
	public static void InvalidEmailValidPass() throws InterruptedException
	{
		
		driver.get(driver.getCurrentUrl());
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ReusableFunction.scrolldown();
	
		
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.Incorrectemail);
		
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.password);
		
		rf.clickButton(driver, Object_repository.SubmitButton);

		
		Thread.sleep(3000);
		
	}
	public static void ValidEmailInValidPass() throws InterruptedException
	{
		driver.get(driver.getCurrentUrl());
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ReusableFunction.scrolldown();
	
		
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.email);
		
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.Incorrectpassword);
		
		rf.clickButton(driver, Object_repository.SubmitButton);

		
		Thread.sleep(3000);
		
	}
	
	public static void Login() throws InterruptedException
	{
		driver.get(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ReusableFunction.scrolldown();
		
		
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.email);
		
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.password);
		
		rf.clickButton(driver, Object_repository.SubmitButton);

		
		Thread.sleep(3000);
		//rf.clickButton(driver,Object_repository.logout);
		
	}
	public static void loginbyrememberme() throws InterruptedException
	{
		driver.get(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		ReusableFunction.scrolldown();
		
		
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.email);
		
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.password);
		rf.clickButton(driver,Object_repository.Rememberme );
		rf.clickButton(driver,Object_repository.SubmitButton);
		
		

		Thread.sleep(3000);
	}
	public static void learnmore() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		
		rf.clickButton(driver,Object_repository.learnmore);
}
	public static void infoicon() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		
		rf.clickButton(driver,Object_repository.infoicon);
		Thread.sleep(3000);
}
	public static void closeoninfoicon() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		
		rf.clickButton(driver,Object_repository.infoicon);
		Thread.sleep(3000);
		rf.clickButton(driver,Object_repository.closeoninfoicon);
		
}
	public static void logout() throws InterruptedException
	{
		driver.get(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ReusableFunction.scrolldown();
		
		
		rf.clickButton(driver, Object_repository.Email);
		rf.sendValue(driver, Object_repository.Email, Config.email);
		
		rf.clickButton(driver, Object_repository.Password);
		rf.sendValue(driver, Object_repository.Password, Config.password);
		
		rf.clickButton(driver, Object_repository.SubmitButton);

		
		Thread.sleep(3000);
		rf.clickButton(driver,Object_repository.logout);
	}
	public static void legacydashboard() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		
		rf.clickButton(driver,Object_repository.legacydashboard);
		Thread.sleep(3000);
}
	public static void Forgotpassword() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		 driver.get("https://app.vumber.com/login./");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		
		rf.clickButton(driver,Object_repository.Forgotpassword);
		Thread.sleep(3000);
		if(driver.getCurrentUrl()=="https://app.vumber.com/forgot/getpassword") 
		
		{
			System.out.println("Page Redirected to forgot password page");
		}
		else {
			System.out.println("Redirection to forgot password page is failed");
			
			
		}
		
		rf.sendValue(driver,Object_repository.usernamefield , "yraju@thapovan-inc.com");
		rf.clickButton(driver,Object_repository.Resetpassword);
		
}
}
		
		
	
	
		
	
	
	
		
	
	
		

