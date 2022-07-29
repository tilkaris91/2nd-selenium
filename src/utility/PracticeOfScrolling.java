package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfScrolling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();// chrome browser will get open

	driver.manage().window().maximize();// to maximize the window

	driver.get("https://zoom.us/signup");
	
 driver.findElement
	(By.xpath("//*[@id='select-1']")).click();
	//WebElement month = driver.findElement(By.xpath("//*[@id='select-item-select-0-8']"));
	//Thread.sleep(2000);
	//WebElement dec = driver.findElement(By.xpath("//*[@id='select-item-select-0-10']"));
 
 
 
 
 
 
 driver.findElement(By.xpath("//*[@class='link']")).click();
 WebElement sign = driver.findElement(By.xpath("//*[@id='email']"));
// WebElement day = driver.findElement(By.xpath("//*[@id='select-item-select-1-9']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='sanket';",sign);
	

	//1)"arguments[0].value='value'",ref variable
	//2)"arguments[0].click()",ref variable
	//3)"windows.scrollBy(0,500)" if u wants to scrool varticl u have to put value in y axise i.e (500,0)
	//4)"arguments[0].scrollIntoView()",ref variable of that webelement
}
}
