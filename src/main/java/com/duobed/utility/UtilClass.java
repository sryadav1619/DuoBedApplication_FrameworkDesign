package com.duobed.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.duobed.TestBase.TestBase;

public class UtilClass extends TestBase{

    public UtilClass()
	{
          PageFactory.initElements(driver, this);
	}
	
	  //Screenshot  
      public static void takesScreenshot(String filename)
	  
	  {
		String path = "C:\\eclipse workspace\\DuoBedApplication\\Screenshot\\";
		 
		try 
		{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
	
		File destination = new File (path+filename+"sry.png");
	   
	    FileHandler.copy(src, destination);
		
		} 
	     
		catch (IOException e)
		{
			System.out.println("Exception found please check");
			e.printStackTrace();
		}
	}
}
