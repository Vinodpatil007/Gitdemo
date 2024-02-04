package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_Keywords_dependsOnMethod2 {

	@Test
	public void login() {
		Reporter.log("login to app",true);

		Assert.fail();
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		Reporter.log("logout from app",true);
		
	}
	
	
	
	
}
