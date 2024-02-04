package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_Keywords_dependsOnMethod3 {
	
	@Test
	public void TC1() {
	
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2() {
		
		Reporter.log("running TC2",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"TC1","TC2"})
	
	public void TC3() {
		
		Reporter.log("running TC3",true);
	}

}
