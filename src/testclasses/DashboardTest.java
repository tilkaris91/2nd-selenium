package testclasses;

import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
	@Test(priority = 3)                                                                
	
	public void searchValidation()
	{
		DB.clickOnGetStarted();
		DB.searchShares();
		
	}
	
	@Test(priority = 4)
	public void buySharesValidation()            
	{
	   DB.buyShares();
		
		
	}
}
