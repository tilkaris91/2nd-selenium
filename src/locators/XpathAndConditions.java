package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class XpathAndConditions {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys();
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		for(int i=1;i<40;i++) {
		if(i%2==1)
			//driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
			driver.findElement(By.xpath("(//input[starts-with(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
			
		}
	
		
}}
