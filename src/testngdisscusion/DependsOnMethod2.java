package testngdisscusion;

import org.testng.annotations.Test;

public class DependsOnMethod2 {
	@Test(dependsOnMethods ="testngdisscusion.DependsOnMethod.homePage",priority=4)
	public void profile()
	{
		System.out.println("Profile Test case");
	}

	
	@Test(priority = 5)
	public void dashBoard()
	{
		System.out.println("dashboard Test case");
	}
}
