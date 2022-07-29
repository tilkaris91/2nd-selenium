package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectTab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/signup");

	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	
	Select sel=new Select(day);
	
	sel.selectByVisibleText("30");
	
	
	WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	 
	Select sl=new Select(month);
	sl.selectByIndex(7);
	
	WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
	Select sll=new Select(year);
	sll.selectByValue("1997");
}
}
