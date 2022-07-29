package testngdisscusion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotetionsInTestNG {
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("befor method");
	}
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}
	@Test
	public void login() {
		System.out.println("login method");
	}
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}

	@AfterTest
	public void at() {
		System.out.println("After test");
	}
}
