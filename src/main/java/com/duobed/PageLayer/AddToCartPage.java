package com.duobed.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.duobed.TestBase.TestBase;

public class AddToCartPage extends TestBase {

	public AddToCartPage()
	{
		PageFactory.initElements(driver,this);
	}
   
	//----------------Object Repository--------------------\\

	@FindBy(xpath="//button[@id=\"addToCart-product-template\"]")
	private WebElement addtocart_btn;
	  
    //-------------------Action Method----------------\\

	public void ClickOnAddToCartButton()
	{
		addtocart_btn.click();
	}
	

}
