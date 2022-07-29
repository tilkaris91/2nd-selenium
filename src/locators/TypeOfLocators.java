package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TypeOfLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("tilkaris91");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("hg");
		
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@class='_8-yf5 ']")).click();	 
		 
	    
		
	}
}
