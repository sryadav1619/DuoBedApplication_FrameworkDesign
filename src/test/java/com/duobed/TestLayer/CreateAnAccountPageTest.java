package com.duobed.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.duobed.PageLayer.CreateAnAccountPage;
import com.duobed.TestBase.TestBase;

public class CreateAnAccountPageTest extends TestBase {

	@Test
	public void createAnAccountFunctionality() throws InterruptedException
	{
		CreateAnAccountPage CA = new CreateAnAccountPage();
	             CA.clickOnCreateAccountLink();
	            
	            JavascriptExecutor js = (JavascriptExecutor)driver;
	 			js.executeScript("scrollBy(0,200)"); 
	             
	 			 CA.enterFirstName();
	 			 Thread.sleep(2000);
	             CA.enterLastName();
	             Thread.sleep(2000);
	             CA.enterEmailID();
	             Thread.sleep(2000);
	             CA.enterPassword();
	             Thread.sleep(2000);
	             CA.clickOnCreateButton();
	
	}
	
	
}
