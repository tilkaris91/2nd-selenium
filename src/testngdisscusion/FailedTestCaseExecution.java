package testngdisscusion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExecution {
	@Test
	public void login() {
		System.out.println("login testcase executed");
		
		
	}
	
	@Test
	public void dashboard() {
		System.out.println("dashboard executed");
	}
	@Test
	public void contacts() {
		System.out.println("contacts executed");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void profile() {
		System.out.println("profile executed");
	}
}
