package waits;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class XplicitWait {


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
  //wait till element is not clickable over the page
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	WebElement desablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
    WebDriverWait waitex=new WebDriverWait(driver, Duration.ofSeconds(60));
  
	waitex.until(ExpectedConditions.elementToBeClickable(desablebutton));
	//(ExpectedConditions.elementToBeClickable
		//	(desablebutton));
	driver.findElement(By.xpath("//*[@id='enable-button']")).click();
//	waiting until the element is visible over the webpage
	
	WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));

	
	waitex.until(ExpectedConditions.visibilityOf(hiddenbutton));
	
	System.out.println("button is displayed on the page");
	
//	waiting till alert popup appear
	
	WebElement alert = driver.findElement(By.xpath("//*[@id=\"alert\"]"));

	alert.click();
	
	waitex.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().accept();
	
	
//	wait for some time
	
	WebElement waitforsometime = driver.findElement(By.xpath("//*[@id='checkbox']"));
	
	waitforsometime.click();
	
//	for checking checkbox clickable or not 
	
	WebElement checkbox = driver.findElement(By.xpath("//*[@id='ch']"));
	
	waitex.until(ExpectedConditions.elementSelectionStateToBe(checkbox, true));
	
	System.out.println("checkbox enabled");
//	
////text transition
//	
//	driver.findElement(By.xpath("//*[@id='populate-text']")).click();
//	
//	WebElement SeleniumWebdriver = driver.findElement(By.xpath("//*[text()='Selenium Webdriver']"));
//	
//	wait.until(ExpectedConditions.textToBePresentInElement(SeleniumWebdriver, "Selenium Webdriver"));
//	
//	System.out.println("text transition");
	   
}
}
