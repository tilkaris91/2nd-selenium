package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwIn {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://groww.in/");
	Thread.sleep(2000);
	driver.findElement
	(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("gauravchendake30@gmail.com");
	Thread.sleep(2000);
	driver.findElement
	(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Continue']"))
	.click();
	//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Continue']
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	
}
}
