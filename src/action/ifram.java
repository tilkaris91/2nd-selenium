package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ifram {
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();// chrome browser will get open
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();// to maximize the window

	driver.get("https://jqueryui.com/slider/");
	Thread.sleep(2000);
	WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	
	driver.switchTo().frame(iframe);
	Thread.sleep(2000);
	
	WebElement slidecomponent = driver.findElement
			(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	
	act.clickAndHold(slidecomponent).moveByOffset(250, 0).moveByOffset(-100, 0).release().build().perform();


}
	

}
