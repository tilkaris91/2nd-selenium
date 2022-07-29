package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();// chrome browser will get open

	driver.manage().window().maximize();// to maximize the window

	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	WebElement fileup = driver.findElement(By.xpath("//*[@name='upload']"));
	
	fileup.sendKeys("C:\\Users\\hp\\Downloads\\Katraj 15 Jan A (9).txt");
}
}
