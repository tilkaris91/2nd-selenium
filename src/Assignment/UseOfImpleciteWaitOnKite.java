package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfImpleciteWaitOnKite {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	
	try {
	driver.get("https://kite.zerodha.com/#loggedout");
	driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("DAA677");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Velocity@123");

	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("866918");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[2]/span")).click();
	}
	catch(NullPointerException n) {
		System.out.println("exception comes");
		
		
	}
	finally{
		System.out.println("sanket");
	}
	
try {
	//driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[3]/span")).click();
	//*[@id="app"]/div[1]/div/div[2]/div[1]/a[4]/span
	
	driver.findElement(By.xpath("//*[@class='su-select holdings-selector']")).click();
	Actions scn=new Actions(driver);
	scn.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
	driver.findElement(By.xpath("//*[@class='user-id']")).click();
	
	driver.findElement(By.xpath("//*[@class='text-lightest']")).click();
}
catch(NoSuchElementException r){
	System.out.println("tilkari");
}

	
	JavascriptExecutor jsn=(JavascriptExecutor)driver;
	WebElement redio = driver.findElement(By.xpath("//*[@class='su-switch-control'][1]"));
	
	jsn.executeScript("arguments[0].scrollIntoView();", redio);
	
//	driver.findElement(By.xpath("//*[@id='radio-179']")).click();
//	
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().back();
//	
}
}
