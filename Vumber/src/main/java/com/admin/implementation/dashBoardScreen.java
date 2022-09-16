package com.admin.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.admin.pageobjects.Object_repository;
import com.admin.repository.Config;
import com.admin.utility.ReusableFunction;
import com.admin.implementation.LoginScreen;

public class dashBoardScreen extends ReusableFunction{

static ReusableFunction rf = new ReusableFunction();

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
	
}
	
	public static void verifyViewIcon() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//rf.clickButton(driver, Object_repository.viewIcon1);
	    String strUrl = driver.getCurrentUrl();
	    System.out.println("Current url is:" +strUrl);
	}
		
		
		
	}


