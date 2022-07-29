package new1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsOfAutomation {
	
	public static void main(String[] args) {
		
		String browser="chrome";
		
		WebDriver wen;//common variable
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");//for driver and its path
		 wen =new ChromeDriver();//object
		 
		 
		if(browser.equals("chrome")) 
		{//condition of exicution
	wen.get("https://www.javatpoint.com/");
	
	wen.get("https://www.youtube.com/");
	
		}
		
		else {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
			
			 wen =new FirefoxDriver();
		}
	
	
		
		
	}
}
