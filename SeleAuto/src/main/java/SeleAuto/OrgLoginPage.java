package SeleAuto;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import SeleAuto.AppConstants.BrowserTypes;

public class OrgLoginPage {
	
	


	public static void main(String[] args) {

		WebDriver driver=AppBrowserStuff.getBrowserInstance(BrowserTypes.Chrome);
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement lgnBtn = driver.findElement(By.id("btnLogin"));
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		lgnBtn.click();

		DashBoard page = PageFactory.initElements(driver, DashBoard.class);
//		page.navigateToPim();
	page.navigateToEmployee("0001", "2139","0025","0024");
		// DashPermManageReviews
		// page=DashBoard.navigateToPerformanceReview(driver);
		// PageFactory.initElements(AppBrowserStuff.driver,
		// navigateToEmployeeList1.class);
		// DashBoard.navigateToEmployeeList1("0113", "0121");
		// navigateToEmp emplist= DashBoard1.navigateToEmp(driver);
		// PageFactory.initElements(driver, DashBoard.selectByEmpId("0001",
		// "0004", "0002"));

		
	
	}

}