package new1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copypest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		Actions acs=new Actions(driver);
		//selectall
		acs.sendKeys(firstname, "bhim jayanti special").keyDown(Keys.CONTROL)
		.sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		//copy
		acs.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//selectwebsite
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//paste
		acs.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).sendKeys(Keys.ENTER).build().perform();
		//WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		
		
		
		
	}
}
