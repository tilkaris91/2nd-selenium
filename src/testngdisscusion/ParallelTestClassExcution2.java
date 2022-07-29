package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestClassExcution2 {
	@Test(enabled=false)
	public void firefox() {
		
			System.setProperty
			("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver1=new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https://meet.google.com/?authuser=0");
		}
	
	
	@Test
	public void mozilla() {
		System.out.println("mozilla executed");
	}

}
