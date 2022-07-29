package HandalingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BotstrapDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();// chrome browser will get open

	driver.manage().window().maximize();// to maximize the window

	driver.get("https://zoom.us/signup");
	
	driver.findElement
	(By.xpath("//*[@class='zm-scrollbar__view']"
			+ "//div[@class='zm-select-input']//span[@id='select-0']")).click();
	WebElement month = driver.findElement(By.xpath("//*[@id='select-item-select-0-8']"));
	
	month.click();
	
}
}
