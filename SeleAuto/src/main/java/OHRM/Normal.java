package OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal {

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
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
