package testngdisscusion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingAnnotations {
	
	@BeforeGroups(groups="sanity")
	public void bg() {
		System.out.println("Before group");
	}
	@AfterGroups(groups="sanity")
	public void ag() {
		System.out.println("After group");
	}
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
	@Test(groups="sanity")
	public void login() {
		System.out.println("login method");
	}
	@Test(groups="sanity")
	public void logout() {
		System.out.println("logout method");
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
