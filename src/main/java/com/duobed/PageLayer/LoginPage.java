package com.duobed.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.duobed.TestBase.TestBase;

public class LoginPage extends TestBase {

	   public LoginPage()
	   {
		   PageFactory.initElements(driver,this);
	   }
	   
	 //---------------Object Repository-----------------\\  
   
	 @FindBy(xpath="(//a[@id=\"customer_login_link\"])[1]")
     private WebElement sign_link;

     @FindBy(xpath="(//input[@placeholder=\"Email\"])[1]")
     private WebElement email_textbox;
     
     @FindBy(xpath="//input[@placeholder=\"Password\"]")
     private WebElement password_textbox;
     
     @FindBy(xpath="//input[@value=\"Sign In\"]")
     private WebElement sign_btn;
     
     
     
     //-----------------Action Method--------------------\\
     
     public void clickOnSignInLink()
     {
    	 
    	 sign_link.click(); 
     }

     public void enterEmailID()
     {
    	 email_textbox.sendKeys("santoshyadav16011999@gmail.com");
     }
 
     public void enterPassword()
     {
    	 password_textbox.sendKeys("Santu@1619");
     }

     public void clickOnSignInButton()
     {
    	 sign_btn.click(); 
     }

     
     
     
     
     
}
