package testngdisscusion;

import org.testng.annotations.Test;

public class inclusionExclusionMethods {
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2 executed");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1 executed");
	}
	@Test(enabled=false)
	public void testCase3()
	{
		System.out.println("Test case 3 executed");
	}

}
