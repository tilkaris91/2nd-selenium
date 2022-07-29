package new1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AutomationExercise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
	  
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		Thread.sleep(2000);
		driver.get("https://gorest.co.in/consumer/login");
		Thread.sleep(2000);
		driver.get("https://honglyte.atlassian.net/jira/software/projects/SAN/boards/1/backlog");
		Thread.sleep(2000);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(2000);
		driver.get("https://www.javatpoint.com/");
		Thread.sleep(2000);
	
		driver.navigate().back();
		Thread.sleep(3000);
	
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
	}
}
