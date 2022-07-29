package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAuto {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/#loggedout");
	driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("DAA677");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Velocity@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("866918");
		
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[2]/span")).click();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[3]/span")).click();
	//*[@id="app"]/div[1]/div/div[2]/div[1]/a[4]/span
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/a[4]/span")).click();
}
}
