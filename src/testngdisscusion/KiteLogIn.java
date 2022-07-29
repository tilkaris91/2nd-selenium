package testngdisscusion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiteLogIn {
	static WebDriver driver;
@Test(priority=1)
public void navToApp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();	
	
	driver.get("https://kite.zerodha.com/#loggedout");
	
}
@Test(priority=2)
public void loginToApp() {
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("DAA677");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Velocity@123");

	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("866918");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@class='button button-blue']"));
	String url = driver.getCurrentUrl();
	
	String isexpeted="dashboard";
	boolean iscontains = url.contains(isexpeted);
	
	Assert.assertEquals(iscontains, false);
}
}
