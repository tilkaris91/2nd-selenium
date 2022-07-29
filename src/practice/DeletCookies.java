package practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletCookies {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		Set<Cookie> cookies = driver.manage().getCookies();
		

		//how to add new cookie in browser
		Cookie cook=new Cookie("mycookies123","123456789");
		 driver.manage().addCookie(cook);
		
		//how many cookie we are have in perticuler website 
		System.out.println("size of cookies :"+cookies.size());
		//for getting cookie and its value
		for(Cookie cookie:cookies)//read and print all cookies
		{
		System.out.println(cookie.getName()+" :"+cookie.getValue());	
		}
		
		//print cookie all property i.e.(time session,expires,path,domain) 
		//System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		//for deeting the cookies
		
		
		driver.quit();
		
	}

}
