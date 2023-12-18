package com.duobed.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.duobed.TestBase.TestBase;

public class CheckoutFunctionalityPage extends TestBase{

	    public CheckoutFunctionalityPage()
	    {
	       PageFactory.initElements(driver,this);
	    }
     
	  //-----------------Object Repository-----------------\\
	    
	    @FindBy(xpath="//button[@name=\"checkout\"]")
        private WebElement checkout_btn;

	    @FindBy(xpath="//input[@id=\"email\"]")
        private WebElement email_textbox;

	    @FindBy(xpath="//select[@id=\"Select2\"]")
        private WebElement country_textbox;

	    @FindBy(xpath="(//input[@name=\"firstName\"])[1]")
        private WebElement firstname_textbox;

	    @FindBy(xpath="(//input[@name=\"lastName\"])[1]")
        private WebElement lastname_textbox;

	    @FindBy(xpath="//input[@id=\"shipping-address1\"]")
        private WebElement address_textbox;

	    @FindBy(xpath="(//input[@name=\"city\"])[1]")
        private WebElement city_textbox;

	    @FindBy(xpath="//select[@id=\"Select3\"]")
        private WebElement province_textbox;

	    @FindBy(xpath="(//input[@name=\"postalCode\"])[1]")
        private WebElement postalcode_textbox;

	    @FindBy(xpath="(//input[@name=\"phone\"])[1]")
        private WebElement mobilenumber_textbox;

	    @FindBy(xpath="//label[contains(@for,'basic-creditCards')]")
        private WebElement creditcard_option;

//	    @FindBy(xpath="//input[@placeholder="Card number"]")
//        private WebElement creditcard_number;
//	    
//	    @FindBy(xpath="//input[@placeholder="Name on card"]")
//        private WebElement nameon_card;
//
//	    @FindBy(xpath="//input[@placeholder="Expiration date (MM / YY)"]")
//        private WebElement expirationdate_field;
//	    
//	    @FindBy(xpath="//input[@placeholder="Security code"]")
//        private WebElement securitycode_field;

	    @FindBy(xpath="//button[contains(@class,'QT4by _1fragemf4 rqC98 EbLsk _7QHNJ VDIfJ j6D1f janiy')]")
        private WebElement paynow_btn;

	    
	//----------------------Action Method---------------------\\
	    
	    
	   public void clickOnCheckoutButton()
	   {
		   checkout_btn.click();  
	   }
	    
	   public void enterCheckoutEmail()
	   {
		   email_textbox.sendKeys("santoshyadav16011999@gmail.com");  
	   }
	   
	   public void enterCountry()
	   {
		   country_textbox.sendKeys("Canada");  
	   } 
	     
	   public void enterFirstName()
	   {
		   firstname_textbox.sendKeys("Santosh");  
	   }  
	    
	   public void enterLastName()
	   {
		   lastname_textbox.sendKeys("Yadav");  
	   } 
	    
	   public void enterAddress()
	   {
		   address_textbox.sendKeys("Calgary Tower");  
	   } 
	     
	   public void enterCity()
	   {
		   city_textbox.sendKeys("Calgary");  
	   } 
	    
	   public void enterProvince() throws InterruptedException
	   {
		   WebElement province = driver.findElement(By.xpath("//select[@id='Select3']"));  
           Select s = new Select(province);     
                 s.selectByValue("AB");	   
       } 
	    
	   public void enterPostalCode()
	   {
		   postalcode_textbox.sendKeys("T2P 1J9");  
	   } 
	    
	   public void enterMobileNumber()
	   {
		   mobilenumber_textbox.sendKeys("8862058660");  
	   } 
	    
	    
      public void clickOnCreditCardButton()
	   {
		   creditcard_option.click();  
	   }  

//	   public void enterCreditCardNumber()
//	   {
//		   creditcard_number.click();
//		   creditcard_number.sendKeys("12345678910");  
//  }
//
//	   public void enterNameOnCard()
//	   {
//		   nameon_card.click();
//		   nameon_card.sendKeys("Santu");  
//	   }
//
//	   public void enterExpirationDateField()
//	   {
//		   expirationdate_field.click();
//		   expirationdate_field.sendKeys("05/15");  
//	   }
// 
//	   public void enterSecuritycode()
//	   {
//		   securitycode_field.click();
//		   securitycode_field.sendKeys("1619");  
//	   }

	   public void enterOnPaynowButton()
	   {
		   paynow_btn.click(); 
	   }

}
