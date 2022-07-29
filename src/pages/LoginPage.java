package pages;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import utility.ReadDataFromConfig;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath ="//*[@id='userid']")
	private WebElement username;
	
	@FindBy(xpath ="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath ="//*[@id='pin']")
	private WebElement pintextfield;
	
	

	@FindBy(xpath ="//*[@type='button']")
	WebElement button;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void enterCredentials() throws IOException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		username.sendKeys(ReadDataFromConfig.getPropData("username"));
		password.sendKeys(ReadDataFromConfig.getPropData("password"));
		

	}

	public void clickOnLogin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		loginbutton.click();
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pintextfield.sendKeys("866918");
		loginbutton.click();
	}

	public String getTitleOfPage() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		button.isDisplayed();
		
		String titleofpage = driver.getTitle();

		return titleofpage;

	}
}
