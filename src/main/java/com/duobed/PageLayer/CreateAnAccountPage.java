package com.duobed.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.duobed.TestBase.TestBase;

public class CreateAnAccountPage extends TestBase {
   
	  public CreateAnAccountPage()
	  {
		  PageFactory.initElements(driver,this);
	  }
	
	  
	//---------------Object Repository-----------------\\  
	  
	  @FindBy(xpath="//a[@id=\"customer_register_link\"]")
	  private WebElement create_account_link;
	  
	  @FindBy(xpath="//input[@id=\"first_name\"]")
	  private WebElement firstname_textbox;
	  
	  @FindBy(xpath="//input[@id=\"last_name\"]")
	  private WebElement lastname_textbox;
	  
	  @FindBy(xpath="//input[@id=\"email\"]")
	  private WebElement email_textbox;
	   
	  @FindBy(xpath="//input[@id=\"create_password\"]")
	  private WebElement password_textbox;
	  
	  @FindBy(xpath="//input[@type=\"submit\"]")
	  private WebElement create_btn;
	 
     
	  //-----------------Action Method----------------\\
 
	  public void clickOnCreateAccountLink()
	  {
		  create_account_link.click();  
	  }
	  
	  public void enterFirstName()
	  {
		  firstname_textbox.sendKeys("Santosh");
	  }
	  
	  public void enterLastName()
	  {
		  lastname_textbox.sendKeys("Yadav");
	  }
	  
	  public void enterEmailID()
	  {
		  email_textbox.sendKeys("santoshyadav16011999@gmail.com");
	  }
	  
	  public void enterPassword()
	  {
		  password_textbox.sendKeys("Santu@1619");  
	  }
	  
	  public void clickOnCreateButton()
	  {
		  create_btn.click();  
	  }







}
