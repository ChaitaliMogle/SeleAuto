package SeleAuto;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashBoard1 {
	

	
	@FindBy(id = "menu__Performance")
	WebElement Performance;

	@FindBy(id = "menu_performance_ManageReviews")
	WebElement ManageReviews;

	@FindBy(id = "menu_performance_searchPerformancReview")
	WebElement searchPerformancReview;

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement viewPimModule;
	
	public static navigateToEmployeeList navigateToEmployeeList(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).moveToElement(driver.findElement(By.id("menu_pim_viewEmployeeList"))).click().build().perform();
		
		WebElement resultTable=driver.findElement(By.id("resultTable"));
		WebElement tbody=resultTable.findElement(By.tagName("tbody"));
		List<WebElement> rows=tbody.findElements(By.tagName("tr"));
		
		for (WebElement row : rows) {
			
			List<WebElement> colns=row.findElements(By.tagName("td"));
			WebElement empIdCol=colns.get(1).findElement(By.tagName("a"));
			System.out.println(empIdCol.getText());
			String str[]={"0113","0121","0123","0132"};
			for (String string : str) {
				
					if(string.equals(empIdCol.getText()))
					{
						colns.get(0).findElement(By.tagName("input")).click();
					}
				
				
				
			}
		
	}
		return PageFactory.initElements(driver, navigateToEmployeeList.class);

	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userName= driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement lgnBtn = driver.findElement(By.id("btnLogin"));
			userName.sendKeys("Admin");
			password.sendKeys("admin123");
			lgnBtn.click();		
		
		DashBoard1.navigateToEmployeeList(driver);
		
		
		
		
	
	

	}
	
}
