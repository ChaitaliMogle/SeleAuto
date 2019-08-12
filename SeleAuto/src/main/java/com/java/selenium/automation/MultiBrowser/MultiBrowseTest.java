package com.java.selenium.automation.MultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class MultiBrowseTest {
		
	private MultiBrowseTest(){}
		
		public static WebDriver getInstance(String type)
		{
	
			WebDriver driver=null;
			switch(type)
			{	
			case "chrome":
						
			System.setProperty("webdriver.chromedriver", "chromedriver.exe");
			driver= new ChromeDriver();
			break;
			
			case "Explorer":
			
			System.setProperty("webdriver.IEDriverServer", "IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			break;
			
			default:
			
			System.out.println("Invalid Type....");
			
			break;
			
			
			}
			return driver;
	
			
		}
		
	



public static WebDriver getCloseBrowser(WebDriver driver)
{
	
	if(driver!=null)
	{
		driver.close();
	}
	
	return null;
	
}

}
