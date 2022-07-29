package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Prac1ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Actions acn =new Actions(driver);
	
		WebElement serchbox = driver.findElement(By.xpath("//*[@jsname='vdLsw']"));
//		acn.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("sanket")
//		.sendKeys(Keys.TAB).sendKeys("tilkari").sendKeys(Keys.TAB)
//		.sendKeys("sankettilkari@gmail.com").build().perform();
         
		acn.click(serchbox).sendKeys("selenium").build().perform();
		Thread.sleep(2000);
		List<WebElement> searchresult = driver.findElements(By.xpath("//*[@jsname='erkvQe']//li[@class='sbct']"));
		
		for (WebElement result:searchresult) {
			String value = result.getText();
			if(value.equals("selenium webdriver")) {
				result.click();
				break;
			}
			System.out.println(value);
		}
	}

}
