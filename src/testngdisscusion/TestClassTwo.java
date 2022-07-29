package testngdisscusion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassTwo {
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	@Test
	public void login()
	{
		System.out.println("login  executed");
	}
	
	@Test
	public void dashboard()
	{
		System.out.println("dasahboard executed");
	}
	@Test
	public void logout()
	{
		System.out.println("logout executed");
	}
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
}
