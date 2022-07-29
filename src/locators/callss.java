package locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShoot;

public class callss {
	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	for(int i=1;i<40;i++) {
		if(i%2==1)
			//driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
			driver.findElement(By.xpath("(//input[starts-with(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
			
		}
	ScreenShoot.capturescrshot(driver,"s");
}}
