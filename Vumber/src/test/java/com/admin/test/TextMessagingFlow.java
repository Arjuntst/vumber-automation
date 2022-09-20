package com.admin.test;

import java.net.MalformedURLException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.implementation.LoginScreen;
import com.admin.implementation.Testmessagingscreen;
import com.admin.reports.Base;


public class TextMessagingFlow extends Base
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
	 
	 
	 @Test(priority=0)
		public static  void Login() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Verify the login fuctionality");
			  LoginScreen.Login();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	 @Test(priority=1)
	 public static  void openAllMsgs() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Open all messages");
			  Testmessagingscreen.openAllMsgs();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	/* @Test(priority=3)
	 public static  void closemsgtab() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("close msg tab");
			  Testmessagingscreen.closemsgtab();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
		}
	 */
	 @Test(priority=2)
	 public static  void SndMessage() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify Send message");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessage();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
	
}/*
	 @Test(priority=4)
	 public static  void SndMessageGIFFile() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify Send message as GIFFile");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessageGIFFile();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
}*/
	 @Test(priority=4)
	 public static  void TextBlast() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Send Messages through TextBlast");
			  Testmessagingscreen.TextBlast();
			  Thread.sleep(4000);
			  //driver.get(driver.getCurrentUrl());

}
	 @Test(priority=5)
	 public static  void cancel() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To verify the cancel button");
			  Testmessagingscreen.cancel();
			  Thread.sleep(4000);
		}
	 @Test(priority=6)
	 public static  void SndEmptyMessage() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send empty message");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndEmptyMessage();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
}
	 @Test(priority=7)
	 public static  void SndMessagewithoutnumber() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send message without number");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessagewithoutnumber();
			  Thread.sleep(2000);
}
	 @Test(priority=8)
	 public static  void sndmsgbyselectinganothervumbernumber() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send message by selecting another vumber number");
			  Thread.sleep(2000);
			  Testmessagingscreen.sndmsgbyselectinganothervumbernumber();
			  Thread.sleep(2000);
}
	 @Test(priority=9)
	 public static  void Refresh() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the Refresh Button Functionality");
			  Thread.sleep(2000);
			  Testmessagingscreen.Refresh();
			  Thread.sleep(2000);
		}
	 @Test(priority=10)
	 public static  void openreceivedonlyMsgs() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the Received only messages functionality");
			  Testmessagingscreen.ReceivedonlyMsgs();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	/* @Test(priority=3)
	 public static  void closemsgtab() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("close msg tab");
			  Testmessagingscreen.closemsgtab();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
		}
	 */
	 @Test(priority=11)
	 public static  void SndMessagethroughReceivedonlymsgs() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify Send message To received only");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessage();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
	
}/*
	 @Test(priority=4)
	 public static  void SndMessageGIFFile() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify Send message as GIFFile");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessageGIFFile();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
}*/
	 @Test(priority=12)
	 public static  void TextBlastthroughreceived() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Send Messages through TextBlast to Received only");
			  Testmessagingscreen.TextBlast();
			  Thread.sleep(4000);
			  //driver.get(driver.getCurrentUrl());

}
	 @Test(priority=13)
	 public static  void cancelbuttonreceivedonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To verify the cancel button in received only");
			  Testmessagingscreen.cancel();
			  Thread.sleep(4000);
		}
	 @Test(priority=14)
	 public static  void SndEmptyMessaeReceivedonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send empty message in received only");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndEmptyMessage();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
}
	 @Test(priority=15)
	 public static  void SndMessagewithoutnumberinreceivedonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send message without number in received only page");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessagewithoutnumber();
			  Thread.sleep(2000);
}
	 @Test(priority=16)
	 public static  void sndmsgbyselectinganothervumbernumberinreceivedonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send message by selecting another vumber number in received only page");
			  Thread.sleep(2000);
			  Testmessagingscreen.sndmsgbyselectinganothervumbernumber();
			  Thread.sleep(2000);
}
	 @Test(priority=17)
	 public static  void RefreshReceivedonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the Refresh Button Functionality in Received only page");
			  Thread.sleep(2000);
			  Testmessagingscreen.Refresh();
			  Thread.sleep(2000);
		}
	 @Test(priority=18)
	 public static  void opensentonlyMsgs() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Open sent only messages");
			  Testmessagingscreen.opensentonlyMsgs();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
			
		}
	/* @Test(priority=3)
	 public static  void closemsgtab() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("close msg tab");
			  Testmessagingscreen.closemsgtab();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
		}
	 */
	 @Test(priority=19)
	 public static  void SndMessagethroughsentonlymsgs() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify Send message by sent only");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessage();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
	
}/*
	 @Test(priority=4)
	 public static  void SndMessageGIFFile() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify Send message as GIFFile");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessageGIFFile();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
}*/
	 @Test(priority=20)
	 public static  void TextBlastthroughsend() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("Send Messages through TextBlast by sent only");
			  Testmessagingscreen.TextBlast();
			  Thread.sleep(4000);
			  //driver.get(driver.getCurrentUrl());

}
	 @Test(priority=21)
	 public static  void cancelbuttoninsentonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To verify the cancel button");
			  Testmessagingscreen.cancel();
			  Thread.sleep(4000);
		}
	 @Test(priority=22)
	 public static  void SndEmptyMessageinsentonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send empty message by sent only");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndEmptyMessage();
			  Thread.sleep(2000);
			  //driver.get(driver.getCurrentUrl());
}
	 @Test(priority=23)
	 public static  void SndMessagewithoutnumberinsentonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send message without number in sent only page");
			  Thread.sleep(2000);
			  Testmessagingscreen.SndMessagewithoutnumber();
			  Thread.sleep(2000);
}
	 @Test(priority=24)
	 public static  void sndmsgbyselectinganothervumbernumberinsentonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify to Send message by selecting another vumber number in sentonly page");
			  Thread.sleep(2000);
			  Testmessagingscreen.sndmsgbyselectinganothervumbernumber();
			  Thread.sleep(2000);
}
	 @Test(priority=25)
	 public static  void Refreshinsentonly() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the Refresh Button Functionality in sent only page");
			  Thread.sleep(2000);
			  Testmessagingscreen.Refresh();
			  Thread.sleep(2000);
		}
	 @Test(priority=26)
	 public static  void infoicon() throws Exception
		{
		      driver.get(driver.getCurrentUrl());
			  test = extent.createTest("To check and verify the info icon");
			  Thread.sleep(2000);
			  Testmessagingscreen.Refresh();
			  Thread.sleep(2000);
}
}


