package SeleAuto;

/*import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;*/

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OhrmScreen {
	
	
	// static WebDriver driver=null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Admin");
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
		/*TakesScreenshot screenshot= (TakesScreenshot)driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
	
		try {
			Files.copy(src, new File("E:\\OHRMScreenShot\\ohrm.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*WebDriver driver= null;
		try{
			
			
			WebElement username= AppBrowserStuff.driver.findElement(By.id("txtUsername"));
			username.sendKeys("Admin");
			WebElement password = AppBrowserStuff.driver.findElement(By.id("txtPassword"));
			password.sendKeys("admin");
			WebElement btn= AppBrowserStuff.driver.findElement(By.id("btnLogin"));
			btn.click();
			
			
		}catch(Exception e)
		{
			TakesScreenshot screenshot= (TakesScreenshot)AppBrowserStuff.driver;
			File src= screenshot.getScreenshotAs(OutputType.FILE);
		
			try {
				Files.copy(src, new File("E:\\OHRMScreenShot\\ohrm1.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
*/
		
		
	}

}
