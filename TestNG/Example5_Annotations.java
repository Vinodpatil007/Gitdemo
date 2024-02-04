package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  Example5_Annotations {

	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser",true);
		
	}
	
	@BeforeMethod
	public void LoginToApp() {
		Reporter.log("login to app",true);
	}
 	
	@Test
	public void verifyPN1() {
		
		Reporter.log("running verify PN1",true);
	}
	
	@Test
	public void verifyPN2() {
		
		Reporter.log("running verify PN2",true);
	}
	
	@AfterMethod
	public void LogoutFromApp(){
		
		Reporter.log("logout from app",true);
	}

	@AfterClass
	
	public void closeBrowser() {
		Reporter.log("close browser",true);
	}
	
	
	
}
