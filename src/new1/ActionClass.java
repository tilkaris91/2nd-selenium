package new1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	 WebElement click = driver.findElement(By.xpath("//*[@name='q']"));
	Actions acs=new Actions(driver);
	Thread.sleep(2000);
    acs.click(click).sendKeys("selenium").perform();
    Thread.sleep(2000);
    //acs.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	//Thread.sleep(2000);
	//acs.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("9168334391").build().perform();
	
    List<WebElement> elements = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//span[text()='selenium']"));
    
    for(WebElement sanket:elements) {
    	String san = sanket.getText();
    	Thread.sleep(2000);
    	if(san.equals("selenium webdriver")) {
    		
    	sanket.getText();
    		break;
    	}
    	System.out.println(san);
    }

    
    
    
    
    
}
}
