package com.java.selenium.automation.manybrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.AppCacheStatus;

public class OrangeHRMTest {

	public static void main(String[] args) {

		WebDriver driver=AppBrowserStuff.getBrowserInstance(AppConstants.BrowserTypes.Chrome);
		driver.get("https://www.orangehrm.com/");
		
		
		
	}

}
