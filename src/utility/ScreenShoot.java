package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShoot {
	public static void capturescrshot(WebDriver driver,String filename) throws IOException {
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		//String path="C:\\Users\\hp\\Desktop\\java programs file\\AutomatedScreenshots\\"+filename+".png";
		String path =System.getProperty("user.dir")+"//screenshot//"+filename+".png";
		File destination =new File(path);
		FileHandler.copy(source, destination);
		
		
		
		
	}
	      
	
	
	
	
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	TakesScreenshot scrshot=(TakesScreenshot)driver;
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	String path="C:\\Users\\hp\\Desktop\\java programs file\\AutomatedScreenshots\\fbscnshot.png";
	
	File destination =new File(path);
	FileHandler.copy(source, destination);

}
	
                   	      
	
}
