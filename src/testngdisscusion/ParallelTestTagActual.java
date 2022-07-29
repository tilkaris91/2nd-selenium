package testngdisscusion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestTagActual {
	 WebDriver driver;
@Parameters({"url","broser","path"})	 
@Test
public void navToApp(String pageurl,String broser,String path) {
	System.setProperty(broser, path);
	if(pageurl.contains("facebook")) {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();	
	
	driver.get(pageurl);}
	else {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();	
		
		driver.get(pageurl);
	}
	
	
}

}
