package com.java.selenium.automation.SeleAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
			
	//	System.out.println(driver.hashCode());
		
		
		
		
	}

}
