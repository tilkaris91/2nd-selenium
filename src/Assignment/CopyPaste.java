package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		  WebElement text = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		Actions acs=new Actions(driver);
		
		acs.keyDown(text, Keys.CONTROL).click().build().perform();
	
	}
}
