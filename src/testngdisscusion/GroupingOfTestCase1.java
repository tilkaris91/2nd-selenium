package testngdisscusion;

import org.testng.annotations.Test;

public class GroupingOfTestCase1 {
	
	@Test(groups={"sanity,fuctional"})
	public void buyshares() {
		System.out.println("buy shares");
	}
	@Test(groups={"regression,fuctional"})
	public void quantity() {
		System.out.println("quantity of shares");
	}
	@Test(groups="sanity")
	public void price() {
		System.out.println("price of shares");
	}
	@Test(groups="functional")
	public void sell() {
		System.out.println("sell shares");
	}

}
