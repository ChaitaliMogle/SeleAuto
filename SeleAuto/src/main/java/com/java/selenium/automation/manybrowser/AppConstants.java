package com.java.selenium.automation.manybrowser;

import org.openqa.selenium.WebDriver;

public class AppConstants {
	
	public String CHROME_DRIVER_PROPERTY = "webdriver.chromedriver";
	public String IE_DRIVER_PROPERTY = "webdriver.IEDriver";
	public String CHROME_DRIVER_FILE = "chromedriver.exe";
	public String IE_DRIVER_FILE = "IEDriver.exe";
	public String INVALID_BROWSER_MESSAGE = "Invalid Browser Type";
	
	public String ORANGE_HRM_SITE_URL="https://www.orangehrm.com/";
	
	enum BrowserTypes{
		Chrome, IEDriver;
	}
			

}
