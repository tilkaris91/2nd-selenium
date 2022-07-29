package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	 Thread.sleep(2000);
	// List<WebElement> daydropdown = driver.findElements(By.xpath("//*[@name='birthday_month']//option"));
	// Thread.sleep(2000);
	 List<WebElement> daydropdown = driver.findElements(By.xpath("//*[@name='birthday_day']//option"));
	// Thread.sleep(2000);
	// List<WebElement> daydropdown = driver.findElements(By.xpath("//*[@name='birthday_year']//option"));
	 for(WebElement value:daydropdown)
		{
			String d = value.getText();
			
			System.out.println(d);
			
			
}
}}
