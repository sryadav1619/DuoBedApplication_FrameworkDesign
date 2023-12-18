package com.duobed.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.duobed.PageLayer.AddToCartPage;
import com.duobed.PageLayer.CheckoutFunctionalityPage;
import com.duobed.PageLayer.LoginPage;
import com.duobed.PageLayer.SelectCategoryAndProductSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

    //<---------------------------Browser Opening--------------------------->\\

	public static WebDriver driver;
	public static LoginPage login;
	public static SelectCategoryAndProductSearchPage sc;
	public static AddToCartPage AtC;
	public static CheckoutFunctionalityPage cfp;
	public static Logger logger;
	
	@BeforeClass
	public void start()
	{
	    logger = Logger.getLogger("DuoBedApplication");
		PropertyConfigurator.configure("Log4j.properties");
	    logger.info("Framework execution started");
	
	}
	
	@AfterClass
	public void end()
	{
	  logger.info("Framework execution ended");
	}
	
	@BeforeMethod
    public void setUp()
    {
		String br ="firefox";
	
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
	       
	           driver = new ChromeDriver();   
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser name is incorrect please check");
		}
		driver.get("https://www.duobed.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    logger.info("Browser launches"+br);
	    logger.info(" Url hit in the browser successfully , maximize window , provided implicitlyWait");
	    
	    
	    
		//<-------------------------login to application----------------------->\\
	    
	    login = new LoginPage();
	    logger.info("logged into application successfully");
	    
	    
		//<------------------Object Creation---------------->

	    sc = new SelectCategoryAndProductSearchPage(); 
	    AtC = new AddToCartPage();
	    cfp = new CheckoutFunctionalityPage();
	    logger.info("Object Creation");

	    
	}
  
	 //<-------------------------Browser Closing--------------------------->\\

	@AfterMethod
	public void tearDown()
	{
	
		driver.quit();
	
	logger.info("browser closed");
	
	}
}
