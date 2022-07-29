package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
  
	//driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[@name='alert']")).click();
	//String gettext = driver.switchTo().alert().getText();
	//System.out.println("text on popup is :-"+gettext);
	//driver.findElement(By.xpath("//*[@name='alert']")).click();
	
	driver.findElement(By.xpath("//*[@name='toPlaceName']")).click();
	Thread.sleep(2000);
	 String get = driver.switchTo().alert().getText();
	System.out.println("ye hai popup pe:-"+get);
}}
