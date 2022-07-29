package testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.Dashboard;
import pages.LoginPage;
import utility.ReadDataFromConfig;

public class BaseTest {
	static WebDriver driver;
	LoginPage lp;
	Dashboard DB;
	
	@BeforeSuite
	public void initBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://kite.zerodha.com/#loggedout");
	}
	
	
	




	@AfterSuite
	public void tearDown()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.quit();
	}
	
	
	@BeforeClass
	public void objectCreation()
	{
		 lp = new LoginPage(driver);
		 DB = new Dashboard(driver);
	}

}
