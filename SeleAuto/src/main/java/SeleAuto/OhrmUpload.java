package SeleAuto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class OhrmUpload {
	
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement lgnBtn = driver.findElement(By.id("btnLogin"));
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		lgnBtn.click();
		
		orangePim(driver);
		
		WebElement choosefile = driver.findElement(By.id("pimCsvImport_csvFile"));
		choosefile.click();
		
		StringSelection ss= new StringSelection("D:\\project\\appirepoprt\\B10.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement btn = driver.findElement(By.id("btnSave"));
		btn.click();
		
		
		
		
	}
	
	public static OrangePim orangePim(WebDriver driver)
	{
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).moveToElement(driver.findElement(By.id("menu_pim_Configuration"))).moveToElement(driver.findElement(By.id("menu_admin_pimCsvImport"))).click().build().perform();
		
		
		return PageFactory.initElements(driver, OrangePim.class);
		
	}

}

//tagname[@id='value']
