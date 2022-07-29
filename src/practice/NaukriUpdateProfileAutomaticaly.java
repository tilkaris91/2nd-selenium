package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUpdateProfileAutomaticaly {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/mnjuser/homepage");
	driver.findElement(By.xpath("//*[@id='usernameField']")).sendKeys("sankettilkari07@gmail.com");
	driver.findElement(By.xpath("//*[@id='passwordField']")).sendKeys("Shree@7030");
	driver.findElement(By.xpath("//*[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
}
}
