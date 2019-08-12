package com.java.selenium.automation.SeleAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chaitu\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("ADMIN");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Admin");

		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();

		driver.close();
	}

}
