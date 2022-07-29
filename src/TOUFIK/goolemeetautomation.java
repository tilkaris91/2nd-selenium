package TOUFIK;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class goolemeetautomation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://meet.google.com/npq-aqqk-dzn");
	String sa;
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofMillis(20));
         wait.until(ExpectedConditions.visibilityOf(sa));
}
}
