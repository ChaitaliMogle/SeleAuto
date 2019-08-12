package SeleAuto;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		
		/*driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		Select dropdown= new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");*/
		
		
		
		Select dropdown = new Select(driver.findElement(By.id("Form_submitRequest_Country")));
		 /*List<WebElement> list= dropdown.getOptions();
		 for (WebElement webElement : list) {
			 System.out.println(webElement.getText());*/
			 
			 
			
		}
		
		 
		
		


		
	}



