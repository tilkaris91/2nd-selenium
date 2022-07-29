package testclasses;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLogin() throws IOException
	{		
		lp.enterCredentials();
		lp.clickOnLogin();
		lp.enterPin();
	}
	
	@Test(priority = 2)
	public void titleValidation()
	{
		   
		
		         
	}         
}
