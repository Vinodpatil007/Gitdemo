package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_Keywords_dependsOnMethod1 {

	
	@Test
	public void login() {
		
	Reporter.log("---login to app---",true);
	}
	
	@Test(  )
	public void logout() {
		
		Reporter.log("--logout from app--",true);
	}

	
	
	
	
}
