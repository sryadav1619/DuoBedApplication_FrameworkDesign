package com.duobed.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.duobed.PageLayer.CheckoutFunctionalityPage;
import com.duobed.TestBase.TestBase;

public class CheckoutFunctionalityPageTest extends TestBase{

	@Test
	public void CheckoutFunctionality() throws InterruptedException
	{
		CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      cfp.clickOnCheckoutButton();
		      
		      Thread.sleep(2000);
		      cfp.enterCheckoutEmail();
		      Thread.sleep(2000);
		      cfp.enterCountry();
		      Thread.sleep(2000);
		      cfp.enterFirstName();
		      Thread.sleep(2000);
		      cfp.enterLastName();
		      Thread.sleep(2000);
		      cfp.enterAddress();
		      Thread.sleep(2000);
		      cfp.enterCity();
		      Thread.sleep(2000);
		      cfp.enterProvince();
		      Thread.sleep(2000);
		      cfp.enterPostalCode();
		      Thread.sleep(2000);
		      cfp.enterMobileNumber();
		     
		      
		   JavascriptExecutor js = (JavascriptExecutor)driver;
 	 			js.executeScript("scrollBy(0,700)"); 
 	              
		      
		      Thread.sleep(2000);
		      cfp.clickOnCreditCardButton();
		      Thread.sleep(2000);
//		      cfp.enterCreditCardNumber();
//		      Thread.sleep(2000);
//		      cfp.enterNameOnCard();
//		      Thread.sleep(2000);
//		      cfp.enterExpirationDateField();
//		      Thread.sleep(2000);
//		      cfp.enterSecuritycode();
//		      Thread.sleep(2000);
		      
		      cfp.enterOnPaynowButton();
		      
		      
		      
		      
		      
		      
		      
	
	}
}
