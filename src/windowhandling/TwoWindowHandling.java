package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		String parentid = driver.getWindowHandle();
		System.out.println("parent id is"+parentid);
		
		WebElement one = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		one.click();
		
		Set<String> allwindowid = driver.getWindowHandles();
		
		for(String ids:allwindowid) {
			if(!(ids.equals(parentid))){
				driver.switchTo().window(ids);
				driver.get("http://www.google.com");
			}
			System.out.println(ids);
			
		}
}}
