package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForTwoWindow {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	String parentid = driver.getWindowHandle();
	System.out.println("parent id is :"+parentid);
	WebElement link = driver.findElement(By.xpath("//*[@id=\"outer-base\"]/div[2]/p[2]/a"));
	
	link.click();
	Set<String> allid = driver.getWindowHandles();
	for(String id:allid) {
		System.out.println(id);
		if(!(id.equals(parentid))) {
			driver.switchTo().window(id);
			//driver.get("http://www.google.com");
			//driver.close();
			//driver.quit();
			driver.findElement(By.xpath("//*[@class='nav-links']")).click();
		}
		//System.out.println(id);
	}

}
}
