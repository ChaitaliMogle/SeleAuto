package com.java.selenium.automation.manybrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.java.selenium.automation.manybrowser.AppConstants.BrowserTypes;


public class AppBrowserStuff {

	private AppBrowserStuff() {

	}

	public static WebDriver getBrowserInstance(BrowserTypes chrome) {

		WebDriver driver = null;

		switch (chrome) {
		case Chrome:
			System.setProperty("webdriver.chromedriver", "chromedriver.exe");
			driver = new ChromeDriver();

			break;

		case IEDriver:
			System.setProperty("webdriver.IEDriver", "IEDriver.exe");
			driver = new InternetExplorerDriver();

			break;
			
		default:
			System.out.println("INVALID_BROWSER_MESSAGE");
		break;

		}

		return driver;
	}

	public static WebDriver getCloseBrowser(WebDriver driver) {
		if (driver != null) {
			driver.close();
		}
		return driver;
	}


}
