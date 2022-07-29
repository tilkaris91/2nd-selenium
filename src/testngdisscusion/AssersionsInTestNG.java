package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssersionsInTestNG {
@Test(enabled=false)
 public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	String title = driver.getTitle();
	String expectedttl ="orangehrm";
	
	   	 boolean ispresent = title.contains(expectedttl);
	   	 Assert.assertTrue(ispresent, "test case is failed please file a buge");
	   	 System.out.println("after assertion statment");
	
	
}
@Test
public void verifyValues()
{
	String actualvalue ="Velocity";
	
	String expectedvalue = "velocity";
	
	Assert.assertEquals(actualvalue, expectedvalue);
	
	
	System.out.println("After assertion statement");
}
}
