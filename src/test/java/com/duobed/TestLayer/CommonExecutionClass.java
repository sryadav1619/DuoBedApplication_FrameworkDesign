package com.duobed.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.duobed.PageLayer.AddToCartPage;
import com.duobed.PageLayer.CheckoutFunctionalityPage;
import com.duobed.PageLayer.LoginPage;
import com.duobed.PageLayer.SelectCategoryAndProductSearchPage;
import com.duobed.TestBase.TestBase;

public class CommonExecutionClass extends TestBase{

	@Test(priority = 1)
	public void firstProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
        
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Sofa Bed with Storage");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnFirstProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
	          cfp.clickOnCheckoutButton();
	          
	          // Because of latest modification in application features some functionalities are changes hence their is need to change below script
	          
		     
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
		      Thread.sleep(2000);
		    
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,2000)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	
	}
      
	@Test (priority=2)
	public void secondProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Storage Chair Ottoman");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnsecondProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		      
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void ThirdProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("King Sofa Bed with Storage");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnThirdProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	@Test (priority=4)
	public void FourthProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Twin Bed with Storage");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnFourthProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		     
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	@Test (priority=5)
	public void fifthProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Leatherette - Noir");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnFifthProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		     
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
	
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test (priority=6)
	public void sixthProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Sofa Back Pillow");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnSixthProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		      
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test (priority=7)
	public void seventhProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Leatherette - Cognac");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnseventhProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		      
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test (priority=8)
	public void eightthProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Sectional Couch with Corner");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOneightthProductTitle();
      
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		     
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test (priority=9)
	public void ninethProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Chaise Lounge with Storage");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOnninethProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		      
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test (priority=10)
	public void tenthProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("6-1 Modular Sectional Couch");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOntenthProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		      
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
		      Thread.sleep(3000);
	}
	
	@Test (priority=11)
	public void eleventhProductPurchaseFunctionality() throws InterruptedException
	{
		//LoginPage login = new LoginPage();
		
	     login.clickOnSignInLink();
	     Thread.sleep(2000);
	     login.enterEmailID();
	     Thread.sleep(2000);
	     login.enterPassword();
	     Thread.sleep(2000);
	     login.clickOnSignInButton();
		
	   // SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

	      sc.selectCategory();
          sc.selectSofa();
                                            
          Thread.sleep(5000);
          sc.clickOnSearchOption();
          Thread.sleep(5000);
          sc.searchProduct("Queen Sofa Bed with Storage");

       JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,200)"); 
         
           sc.ClickOneleventhProductTitle();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
 			js1.executeScript("scrollBy(0,300)");
	
	
 		//	AddToCartPage AtC = new AddToCartPage();
 			
	         AtC.ClickOnAddToCartButton();

	    //     CheckoutFunctionalityPage cfp = new CheckoutFunctionalityPage();
		      
	          Thread.sleep(3000);
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
		      Thread.sleep(2000);
		      
		      
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 			js2.executeScript("scrollBy(0,400)"); 
	              
		      
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
		      
		      JavascriptExecutor js3 = (JavascriptExecutor)driver;
	 			js3.executeScript("scrollBy(0,1800)"); 
	              
		      Thread.sleep(2000);
		      cfp.enterOnPaynowButton();
	
	}
}
