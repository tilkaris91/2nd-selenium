package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Dashboard {
	WebDriver driver;
	@FindBy(xpath ="//*[@type='button']")
	private WebElement getstartedbutton;
	
	@FindBy(xpath ="//div[@class='instrument-search']//*[@type='text']")
	private WebElement searchbox;
	
	@FindBy(xpath ="//*[@class='eight columns text-right']//*[@class='button-outline button-blue']")
	private WebElement buybutton;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement outerbuybutton;
	
	

	@FindBy(xpath ="//*[@class='message']")
	WebElement textmessage;

	

	public Dashboard(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void clickOnGetStarted() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		getstartedbutton.click();
		
	}

	public void searchShares() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		searchbox.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

	public void buyShares() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		buybutton.click();
		outerbuybutton.click();
		String actual = textmessage.getText();	

		
	}
}
