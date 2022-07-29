package testngdisscusion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
@Test(groups="sanity")
public void login() {
	System.out.println("login test case");
}
@Test(groups={"regression,sanity,functional"})
public void home() {
	System.out.println("home test case");
}
@Test(groups={"sanity,regression"})
public void dashboard() {
	System.out.println("dashboard test case");
}
@Test(groups="functional")
public void logout() {
	System.out.println("logout test case");
}
}
