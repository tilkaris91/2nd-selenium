package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();// chrome browser will get open

	driver.manage().window().maximize();// to maximize the window

	driver.get("https://jqueryui.com/slider/");
	
	WebElement slider = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	
	driver.switchTo().frame(slider);
	WebElement kkj = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	Actions scn =new Actions(driver);
	scn.clickAndHold(kkj).moveByOffset(200, 0).moveByOffset(-150, 0).release().build().perform();
}
}
