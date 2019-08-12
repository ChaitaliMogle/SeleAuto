package SeleAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import SeleAuto.AppConstants.BrowserTypes;

public class AppBrowserStuff {

	public static WebDriver driver;

	public static WebDriver getBrowserInstance(BrowserTypes type) {

		switch (type) {
		case Chrome:
			System.setProperty("CHROME_DRIVER_PROPERTY", "CHROME_DRIVER_FILE");
//			System.setProperty(AppConstants.CHROME_DRIVER_PROPERTY, "CHROME_DRIVER_FILE");
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

	/*
	 * public static WebDriver getCloseBrowser(WebDriver driver) { if (driver !=
	 * null) { driver.close(); } return driver; }
	 */

}
