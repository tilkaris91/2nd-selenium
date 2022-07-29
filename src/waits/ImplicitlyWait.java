package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     
	driver.get("https://www.google.com");
	
	WebElement textbox = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	textbox.sendKeys("india");
	
	Actions scn=new Actions(driver);
	scn.sendKeys(Keys.RETURN).perform();
	WebElement usd = driver.findElement(By.xpath("//*[text()='India - United States Department of State']"));
	//*[text()='India - United States Department of State']
	usd.click();
	
	
	
}
}
