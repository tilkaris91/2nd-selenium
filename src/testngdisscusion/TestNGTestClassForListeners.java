package testngdisscusion;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestClassForListeners {
	WebDriver driver;
	@Test
	public void login()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		String title = driver.getTitle();
		String expectedttl ="orangehrm";
		
		   	 boolean ispresent = title.contains(expectedttl);
		   	 Assert.assertTrue(ispresent, "test case is failed please file a buge");
		   	 System.out.println("after assertion statment");
	}
	
	@Test
	public void dashboard()
	{
		System.out.println("dasahboard executed");
	}

	@Test
	public void home()
	{
		System.out.println("home  executed");
	}
	
	@Test
	public void contacts()
	{
		System.out.println("contacts executed");
		
	}
	@Test
	public void profile()
	{
		System.out.println("profile executed");
	}
	@Test
	public void logout()
	{
		System.out.println("logout executed");
	
	}
}
