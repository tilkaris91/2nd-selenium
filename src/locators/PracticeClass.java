package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action;jsessionid=5BC044FEDB2E94E0817AB193FADCBF8F");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@name='keyword']")).sendKeys("Fish");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	
	
}
}
