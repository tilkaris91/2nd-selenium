package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingMachanism {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
//scroll by pixle	
	//js.executeScript("window.scrollBy(0,800)");
	
	//js.executeScript("window.scrollBy(0,-500)");
	
//scroll by webelement
	WebElement webelement = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_4']"));
	WebElement webelements = driver.findElement(By.xpath("//*[text()='Goutam.Ganesh']"));
	js.executeScript("arguments[0].scrollIntoView();", webelements);
	
	//*[text()='Goutam.Ganesh']
}
}
