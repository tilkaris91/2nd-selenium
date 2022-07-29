package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClassTestNG {
     @Test
	public void logout() {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

    		WebDriver driver = new ChromeDriver();

    		driver.manage().window().maximize();

    		driver.get("https://zoom.us/signup");
    		
    		Reporter.log("this is logout testcase", true);
		
	}
}
