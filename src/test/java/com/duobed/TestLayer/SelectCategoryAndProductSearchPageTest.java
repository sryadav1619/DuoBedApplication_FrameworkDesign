package com.duobed.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.duobed.PageLayer.SelectCategoryAndProductSearchPage;
import com.duobed.TestBase.TestBase;

public class SelectCategoryAndProductSearchPageTest extends TestBase {

	@Test
	public void selectcategoryfunctionality() throws InterruptedException
	{
	
       SelectCategoryAndProductSearchPage sc = new SelectCategoryAndProductSearchPage(); 

                       sc.selectCategory();
	                   sc.selectSofa();
	                   
	                   Thread.sleep(5000);
	                   sc.clickOnSearchOption();
	                   Thread.sleep(5000);
	                   sc.searchProduct("Sofa Bed with Storage");
	
	          JavascriptExecutor js = (JavascriptExecutor)driver;
	   	 			js.executeScript("scrollBy(0,200)"); 
	   	             
	                   sc.ClickOnFirstProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnsecondProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnThirdProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnFourthProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnFifthProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnSixthProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnseventhProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOneightthProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOnninethProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOntenthProductTitle();
	                   Thread.sleep(2000);
	                   sc.ClickOneleventhProductTitle();
	                   
	            JavascriptExecutor js1 = (JavascriptExecutor)driver;
		   	 			js1.executeScript("scrollBy(0,300)"); 
		   	                    
	                  
	}              
	
	








}
