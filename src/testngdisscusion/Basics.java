package testngdisscusion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Basics {
	
	WebDriver driver1;


	@Test(  priority= 1)
    public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	 driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		
		
		driver1.get("https://kite.zerodha.com/#loggedout");
		driver1.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("DAA677");
		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Velocity@123");

		driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).click();
		
	}
	@Test( priority= 2)
    public void pin() {
		//driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("866918");
		driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button")).click();
		
	}
//	@Test(priority= 3)
//    public void dashboard() {
//		//driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[2]/span")).click();
//
//		//driver.switchTo().alert().accept();
//		driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[3]/span")).click();
//		//*[@id="app"]/div[1]/div/div[2]/div[1]/a[4]/span
//	}
//	@Test(priority= 4)
//    public void portfolio() {
//		//driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver1.findElement(By.xpath("//*[@class='su-select holdings-selector']")).click();
//		Actions scn=new Actions(driver1);
//		scn.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
//		
//	}
//	
//	@Test(priority= 5)
//    public void logout() {
//		//driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver1.findElement(By.xpath("//*[@class='user-id']")).click();
//		
//		driver1.findElement(By.xpath("//*[@class='text-lightest']")).click();
//		
//
//		
//		JavascriptExecutor jsn=(JavascriptExecutor)driver1;
//		WebElement redio = driver1.findElement(By.xpath("//*[@class='su-switch-control'][1]"));
//		
//		jsn.executeScript("arguments[0].scrollIntoView();", redio);
//		
//		driver1.findElement(By.xpath("//*[@id='radio-179']")).click();
//	}
	
}
