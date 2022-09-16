package com.admin.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import com.admin.pageobjects.Object_repository;
import com.admin.pageobjects.Object_repository_textmessage;
import com.admin.repository.Config;
import com.admin.utility.ReusableFunction;

public class Testmessagingscreen extends ReusableFunction {
	
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
	public static void openAllMsgs() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.textMsg);
		rf.clickButton(driver, Object_repository_textmessage.all);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	}
	public static void closemsgtab() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.textMsg);
		rf.clickButton(driver, Object_repository_textmessage.all);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		rf.clickButton(driver, Object_repository_textmessage.newtext);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		rf.clickButton(driver, Object_repository_textmessage.close);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	public static void SndMessage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.newtext);
		Thread.sleep(5000);
		rf.sendValue(driver, Object_repository_textmessage.textfield,"2034337274");
		rf.sendValue(driver, Object_repository_textmessage.messagefield,"Testing vumber");
		rf.clickButton(driver, Object_repository_textmessage.messagesend);
		Thread.sleep(3000);
		rf.clickButton(driver, Object_repository_textmessage.close);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	
		
     }
	/*public static void SndMessageGIFFile() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.newtext);
		Thread.sleep(5000);
		rf.sendValue(driver, Object_repository_textmessage.textfield,"3853888721");
		rf.sendValue(driver, Object_repository_textmessage.messagefield,"Testing vumber");
		rf.sendValue(driver, Object_repository_textmessage.Addimage,"D:\\Images\\BYE.gif");
		Thread.sleep(25000);
		rf.clickButton(driver, Object_repository_textmessage.messagesend);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	
		
     }
     */
	public static void TextBlast() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.Vumberselect);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.TextBlast);
		Thread.sleep(2000);
		rf.sendValue(driver,Object_repository_textmessage.Messagetext, "Testing is in Progress");
		rf.clickButton(driver,Object_repository_textmessage.PopupMessageSND);
		Thread.sleep(6000);
		
	
	}
	public static void cancel() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.Vumberselect);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.cancel);
}
	public static void SndEmptyMessage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.newtext);
		Thread.sleep(5000);
		rf.sendValue(driver, Object_repository_textmessage.textfield,"2034337274");
		rf.clickButton(driver, Object_repository_textmessage.messagesend);
		Thread.sleep(3000);
		rf.clickButton(driver, Object_repository_textmessage.close);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
}
	public static void SndMessagewithoutnumber() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		rf.clickButton(driver, Object_repository_textmessage.newtext);
		Thread.sleep(5000);
		rf.sendValue(driver, Object_repository_textmessage.messagefield,"Testing vumber");
		rf.clickButton(driver, Object_repository_textmessage.messagesend);
		Thread.sleep(3000);
		rf.clickButton(driver, Object_repository_textmessage.close);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
		public static void sndmsgbyselectinganothervumbernumber() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			rf.clickButton(driver, Object_repository_textmessage.newtext);
			Thread.sleep(5000);
			rf.sendValue(driver, Object_repository_textmessage.textfield,"2034337274");
			Select numbers = new Select(driver.findElement(rf.getBy(driver,Object_repository_textmessage.selectdropdown)));
			numbers.selectByVisibleText("601 202 1193 Arjun Testing");
			rf.sendValue(driver, Object_repository_textmessage.messagefield,"Testing vumber");
			rf.clickButton(driver, Object_repository_textmessage.messagesend);
			Thread.sleep(3000);
			rf.clickButton(driver, Object_repository_textmessage.close);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
		
			
	     
}
		public static void Refresh() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			rf.clickButton(driver, Object_repository_textmessage.textMsg);
			rf.clickButton(driver, Object_repository_textmessage.all);
			rf.clickButton(driver, Object_repository_textmessage.Refresh);
		}
		public static void opensentonlyMsgs() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			rf.clickButton(driver, Object_repository_textmessage.textMsg);
			rf.clickButton(driver, Object_repository_textmessage.sentonly);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
		}
}
		
	 
		// TODO Auto-generated method stub

	
