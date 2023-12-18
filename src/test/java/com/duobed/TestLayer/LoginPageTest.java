package com.duobed.TestLayer;

import org.testng.annotations.Test;

import com.duobed.PageLayer.LoginPage;
import com.duobed.TestBase.TestBase;

public class LoginPageTest extends TestBase{

	@Test
	public void LoginFunctionality() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		
		     login.clickOnSignInLink();
		     Thread.sleep(2000);
		     login.enterEmailID();
		     Thread.sleep(2000);
		     login.enterPassword();
		     Thread.sleep(2000);
		     login.clickOnSignInButton();
		
	}
	
	
	
	
	
	
}
