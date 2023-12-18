package com.duobed.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.duobed.TestBase.TestBase;

public class SelectCategoryAndProductSearchPage extends TestBase {

	public SelectCategoryAndProductSearchPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//-------------Object Repository---------------\\
	
	//--------------select category
	
	@FindBy(xpath="(//span[@class=\"icon icon-arrow-down\"])[1]")
	private WebElement selectcategory_module;
	
	@FindBy(xpath="(//span[@class=\"icon icon-arrow-down\"])[1]")
	private WebElement sofa;
	
	//---------------search Product
	
	@FindBy(xpath="(//button[@type=\"submit\"])[1]")
	private WebElement search_option;
	
	@FindBy(xpath="(//input[@name=\"q\"])[1]")
	private WebElement search_selectedproduct;
	
	@FindBy(xpath="//p[text()='Sofa Bed with Storage']")
	private WebElement sofaproduct_title;
	
	@FindBy(xpath="//p[text()='Storage Chair Ottoman']")
	private WebElement chairproduct_title;
	
	@FindBy(xpath="//p[text()='King Sofa Bed with Storage']")
	private WebElement bedproduct_title;
	
	@FindBy(xpath="//p[text()='Twin Bed with Storage']")
	private WebElement twinbedproduct_title;
	
	@FindBy(xpath="//p[text()='Leatherette - Noir']")
	private WebElement Leatherettenoirproduct_title;
	
	@FindBy(xpath="//p[text()='Sofa Back Pillow']")
	private WebElement sofabackproduct_title;
	
	@FindBy(xpath="//p[text()='Leatherette - Cognac']")
	private WebElement leatherettecognacproduct_title;
	
	@FindBy(xpath="//p[text()='Sectional Couch with Corner']")
	private WebElement sectionalcouchproduct_title;
	
	@FindBy(xpath="//p[text()='Chaise Lounge with Storage']")
	private WebElement chaiseproduct_title;
	
	@FindBy(xpath="//p[text()='6-1 Modular Sectional Couch']")
	private WebElement modularproduct_title;
	
	@FindBy(xpath="//p[text()='Queen Sofa Bed with Storage']")
	private WebElement queensofabedproduct_title;
	
	
	//-----------------Action Method-----------------\\
	
	public void selectCategory() throws InterruptedException
	{
		selectcategory_module.click();
		
//        Select d = new Select(selectcategory_module);
//           d.selectByIndex(3);      
//            Thread.sleep(3000);
//	
	}

	public void selectSofa()
	{
		sofa.click();
	}
	
	public void clickOnSearchOption()
	{
		search_option.click();
	}
	
	public void searchProduct(String SelectedProduct)
	{
		search_selectedproduct.sendKeys(SelectedProduct);
		search_option.click();
	}
	
	public void ClickOnFirstProductTitle()
	{
		sofaproduct_title.click();
	}
	
	public void ClickOnsecondProductTitle()
	{
		chairproduct_title.click();
	}
	
	public void ClickOnThirdProductTitle()
	{
		bedproduct_title.click();
	}
	
	public void ClickOnFourthProductTitle()
	{
		twinbedproduct_title.click();
	}
	
	public void ClickOnFifthProductTitle()
	{
		Leatherettenoirproduct_title.click();
	}
	
	public void ClickOnSixthProductTitle()
	{
		sofabackproduct_title.click();
	}
	
	public void ClickOnseventhProductTitle()
	{
		leatherettecognacproduct_title.click();
	}
	
	public void ClickOneightthProductTitle()
	{
		sectionalcouchproduct_title.click();
	}
	
	public void ClickOnninethProductTitle()
	{
		chaiseproduct_title.click();
	}
	
	public void ClickOntenthProductTitle()
	{
		modularproduct_title.click();
	}
	
	public void ClickOneleventhProductTitle()
	{
		queensofabedproduct_title.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
