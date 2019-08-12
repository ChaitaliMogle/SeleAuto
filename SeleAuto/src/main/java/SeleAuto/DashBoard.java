package SeleAuto;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleAuto.AppConstants.BrowserTypes;

public class DashBoard {

	@FindBy(id = "menu__Performance")
	WebElement Performance;

	@FindBy(id = "menu_performance_ManageReviews")
	WebElement ManageReviews;

	@FindBy(id = "menu_performance_searchPerformancReview")
	WebElement searchPerformancReview;

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement viewPimModule;

	/*
	 * public static DashPermManageReviews navigateToPerformanceReview(WebDriver
	 * driver) { //System.out.println(Performance);
	 * 
	 * Actions action= new Actions(driver);
	 * action.moveToElement(driver.findElement(By.xpath(
	 * "//*[@id=\"menu__Performance\"]/b"
	 * ))).moveToElement(driver.findElement(By.
	 * id("menu_performance_ManageReviews"
	 * ))).moveToElement(driver.findElement(By
	 * .id("menu_performance_searchPerformancReview"
	 * ))).click().build().perform(); //*[@id="menu__Performance"] return
	 * PageFactory.initElements(driver, DashPermManageReviews.class); }
	 */

	// public static DashPermManageReviews selectByEmpId(String... empIds) {

	// public static navigateToEmployeeList1 navigateToEmployee(WebDriver
	// driver) {

	public static navigateToEmployeeList1 navigateToPim() {

		Actions action = new Actions(AppBrowserStuff.driver);
		action.moveToElement(
				AppBrowserStuff.driver.findElement(By
						.id("menu_pim_viewPimModule")))
				.moveToElement(
						AppBrowserStuff.driver.findElement(By
								.id("menu_pim_viewEmployeeList"))).click()
				.build().perform();

		return PageFactory.initElements(AppBrowserStuff.driver,
				navigateToEmployeeList1.class);
	}

	public static void navigateToEmployee(String... empIds) {
		navigateToPim();
		Actions action = new Actions(AppBrowserStuff.driver);
		action.moveToElement(
				AppBrowserStuff.driver.findElement(By
						.id("menu_pim_viewPimModule")))
				.moveToElement(
						AppBrowserStuff.driver.findElement(By
								.id("menu_pim_viewEmployeeList"))).click()
				.build().perform();

		WebElement resultTable = AppBrowserStuff.driver.findElement(By
				.id("resultTable"));
		WebElement tbody = resultTable.findElement(By.tagName("tbody"));
		List<WebElement> rows = tbody.findElements(By.tagName("tr"));

		for (WebElement row : rows) {

			List<WebElement> colns = row.findElements(By.tagName("td"));
			WebElement empIdCol = colns.get(1).findElement(By.tagName("a"));
			System.out.println(empIdCol.getText());
			try{
			for (String id : empIds) {

				if (id.equals(empIdCol.getText())) {
					colns.get(0).findElement(By.tagName("input")).click();
				}

			}
			}catch(Exception e){}
		}

	}

}
