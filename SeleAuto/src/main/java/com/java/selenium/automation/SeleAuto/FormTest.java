package com.java.selenium.automation.SeleAuto;

import java.util.List;

import javax.swing.text.html.ListView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chaitu\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com//open-source//register-to-download/");

		WebElement firstName = driver.findElement(By.name("FirstName"));
		firstName.sendKeys("Chaitali");

		WebElement lastName = driver.findElement(By.name("LastName"));
		lastName.sendKeys("Mogle");
		
		//CompanyName
		WebElement companyname=driver.findElement(By.name("CompanyName"));
		companyname.sendKeys("Jarvissoft.com");
		
		List<WebElement> industry=driver.findElements(By.id("Form_submitRequest_Industry"));
		Select dropdown= new Select((WebElement) industry);
		dropdown.selectByValue("Industry");
		
		/*for (WebElement webElement : industry) {
			
			if(webElement.getText().contains("Aerospace"))
			{
				continue;
			}
			else 
				
				System.out.println(webElement);
				break;
			
				
			
			
		}*/
		
		/*WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();*/

		driver.close();
	}

}

