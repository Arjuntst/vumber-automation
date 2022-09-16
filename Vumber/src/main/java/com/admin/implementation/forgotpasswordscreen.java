package com.admin.implementation;

import java.util.concurrent.TimeUnit;

import com.admin.pageobjects.Object_repositary_forgotpassword;
import com.admin.utility.ReusableFunction;

public class forgotpasswordscreen  extends ReusableFunction {
	
	static ReusableFunction rf = new ReusableFunction();
	
	
	public static void forgotpassword() throws InterruptedException
	{
		driver.get(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ReusableFunction.scrolldown();
		
		rf.clickButton(driver,Object_repositary_forgotpassword.forgotpassword);
		
		
	
	
	}
		
	

	

}
