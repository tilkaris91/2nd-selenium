package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestClassExcution1 {
	@Test(enabled=false)
	public void login()
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

 		WebDriver driver = new ChromeDriver();

 		driver.manage().window().maximize();

 		driver.get("https://zoom.us/signup");
		System.out.println("login  executed");
	}
	@Test
	public void dashboard() {
		System.out.println("dashboard executed");
	}
	
	@Test
	public void profile() {
		System.out.println("profile executed");
	}
	
}
