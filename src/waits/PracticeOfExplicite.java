package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeOfExplicite {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	WebElement hidden = driver.findElement(By.xpath("//*[@id='hidden']"));
	
	 driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
	 
	WebDriverWait wdw=new WebDriverWait(driver, Duration.ofSeconds(60));
	
	wdw.until(ExpectedConditions.elementToBeClickable(hidden));
	
	 driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
	 
}
}
