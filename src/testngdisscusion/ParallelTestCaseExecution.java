package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestCaseExecution {
	@Test
	public void login()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

 		WebDriver driver = new ChromeDriver();

 		driver.manage().window().maximize();

 		driver.get("https://zoom.us/signup");
		System.out.println("login  executed");
	}
	
	@Test
	public void dashboard()
	{
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://meet.google.com/?authuser=0");
	}
	
}
