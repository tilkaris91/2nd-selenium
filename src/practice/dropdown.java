package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/signup");
	//driver.findElement(By.xpath("//*[@id='day']")).click();
	WebElement noaccout = driver.findElement(By.xpath("//*[text()='Already have an account?']"));
      Actions scn=new Actions(driver);
      
scn.keyDown(Keys.CONTROL).click(noaccout).keyDown(Keys.CONTROL).build().perform();

}}
