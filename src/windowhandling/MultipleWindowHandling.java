package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {


public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	//String parentid = driver.getWindowHandle():
	//System.out.println("parent id is :"+parentid);
	WebElement link = driver.findElement(By.xpath("//*[@id=\"outer-base\"]/div[2]/p[2]/a"));
	link.click();
	link.click();
	link.click();
	
	Set<String> all = driver.getWindowHandles();
               int length = all.size();
               int i=0;
               String [] k=new String[length];
               
               for(String ids:all) {
            	
				k[i]=ids;
            	   i++;
            	   
               }
	driver.switchTo().window(k[1]);
	driver.get("https://www.google.com");
}
}
