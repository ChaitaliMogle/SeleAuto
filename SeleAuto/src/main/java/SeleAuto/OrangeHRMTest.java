package SeleAuto;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.AppCacheStatus;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMTest {

	public static void main(String[] args) {

		List<String> profession = new ArrayList<String>();
		profession.add("Automation Tester");
		profession.add("Manual Tester");

		List<String> commands = new ArrayList<String>();
		commands.add("Browser Commands");
		commands.add("WebElement Commands");

		List<String> tools = new ArrayList<String>();
		tools.add("QTP");
		tools.add("Selenium Webdriver");

		UserInfo ui = new UserInfo();
		ui.setFirstName("AA");
		ui.setLastName("BB");
		ui.setGender("Male");
		ui.setYearOfExp(7);
		ui.setDate("12/03/2019");
		ui.setProfession(profession);
		ui.setTools(tools);
		ui.setContinents("Africa");

		WebDriver driver = AppBrowserStuff
				.getBrowserInstance(AppConstants.BrowserTypes.Chrome);
		driver.get("https://www.toolsqa.com/automation%20practice%20form/");

		WebElement wfirstName = driver.findElement(By.name("firstname"));
		wfirstName.sendKeys("AA");

		WebElement wlastName = driver.findElement(By.name("lastname"));
		wlastName.sendKeys("BB");

		List<WebElement> wgenderType = driver.findElements(By.name("sex"));
		for (WebElement gender : wgenderType) {
			if (gender.getAttribute("value").equals(ui.getGender())) {
				gender.click();
				break;
			}

		}

		List<WebElement> wyearOfExp = driver.findElements(By.name("exp"));

		for (WebElement yearofexp : wyearOfExp) {//due to primitive we use == for content comparison
			if (Integer.parseInt(yearofexp.getAttribute("value")) == ui
					.getYearOfExp()) {
				yearofexp.click();
				break;
			}

		}

		WebElement wdate = driver.findElement(By.id("datepicker"));
		wdate.sendKeys(ui.getDate());
		
		List<WebElement> wprofession = driver.findElements(By
				.name("profession"));
		
		for (String webElement : profession) {
			
			for (WebElement prof : wprofession) {
				if(prof.getAttribute("value").equals(webElement))
				{
				prof.click();
					continue;
				}
			}
			
			
			
		}
		List<WebElement> wtools = driver.findElements(By.name("tool"));
		for (WebElement elm : wtools) {
			String val = elm.getAttribute("value");
			if(tools.contains(val)){
				continue;
			}
			elm.click();
			break;
			
			
		}
		
				
		Select wcontinents = new Select(driver.findElement(By.id("continents")));
		
		wcontinents.selectByVisibleText(ui.getContinents());
		
		
		
		Select wcommands = new Select(driver.findElement(By.id("selenium_commands")));
		for (String listofcmd : commands) {
			wcommands.selectByVisibleText(listofcmd);
			
		}
		
		
		
		
	}

}

class UserInfo {
	private String firstName;
	private String lastName;
	private String gender;
	private int yearOfExp;
	private String date;
	private List<String> profession;
	private List<String> tools;
	private String continents;
	private List<String> commands;

	public UserInfo(String firstName, String lastName, String gender,
			int yearOfExp, String date, List<String> profession,
			List<String> tools, String continents, List<String> commands) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.yearOfExp = yearOfExp;
		this.date = date;
		this.profession = profession;
		this.tools = tools;
		this.continents = continents;
		this.commands = commands;
	}

	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getProfession() {
		return profession;
	}

	public void setProfession(List<String> profession) {
		this.profession = profession;
	}

	public List<String> getTools() {
		return tools;
	}

	public void setTools(List<String> tools) {
		this.tools = tools;
	}

	public String getContinents() {
		return continents;
	}

	public void setContinents(String continents) {
		this.continents = continents;
	}

	public List<String> getCommands() {
		return commands;
	}

	public void setCommands(List<String> commands) {
		this.commands = commands;
	}

}
