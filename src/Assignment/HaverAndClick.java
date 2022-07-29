package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HaverAndClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		WebElement haver = driver.
				findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement haverrer = driver.
				findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		Actions mause=new Actions(driver);
		
		mause.moveToElement(haver).perform();
		mause.moveToElement(haverrer).perform();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']")).click();
}}
