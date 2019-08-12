package SeleAuto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeys {
	
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		
	/*	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.click();
		driver.manage().window().maximize();
		
		
		//firstName.sendKeys("Chat");
	try{
		((JavascriptExecutor)driver).executeAsyncScript("args[2].value='chaitali'", "send");
		}catch(Exception e){
			System.out.println("Exception handled");
		}
		
		StringSelection ss= new StringSelection("apeksha");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//driver.manage().window().setPosition("new Point(-2000,0)");
*/		
		}

}
