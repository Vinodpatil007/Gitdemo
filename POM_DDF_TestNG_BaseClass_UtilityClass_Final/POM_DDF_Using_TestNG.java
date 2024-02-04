package POM_DDF_TestNG_BaseClass_UtilityClass_Final;



import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_DDF_Using_TestNG extends Base_Class {

	
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
        
		 initializeBrowser();
		 login1 = new KiteLogin1Page(driver);
		 login2 = new KiteLogin2Page(driver);
		 home=new KiteHomePage(driver);
		
		
	}
	
	
	
	@BeforeMethod
	public void LogintoApplication() throws IOException {
		login1.inpKiteLogin1PageUsername(Utility_Class.readPropertyFileData("UN"));
		login1.inpKiteLogin1PagePassword(Utility_Class.readPropertyFileData("PWD"));
		login1.clickKiteLogin1PageLoginBtn();
		login2.InpKiteLogin2PagePin(Utility_Class.readPropertyFileData("PIN"));
	    login2.ClickKiteLogin2PageContBtn();
		
	}
	
	
	@Test
	public void verifyProfileName() throws IOException {
		
		TCID = 4;
		String actUserID = home.getKiteHomePageUserID();
		String expUserID = Utility_Class.getTestData(0, 3);
		
		Assert.assertEquals(actUserID, expUserID,"actUserID & expUserID are diffrent");
		Utility_Class.captureScreenshot(driver, TCID);
		
		
	}
	
	
	@AfterMethod
	public void logoutfromApplication(ITestResult result) throws IOException {
	
		Reporter.log("logout from app");
		
		Reporter.log("Capture Screenshot Only Failled Test Cases---");
		if (result.getStatus()==ITestResult.FAILURE) {
			Utility_Class.captureScreenshot(driver, TCID);
		}
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Reporter.log("close browser");
		Thread.sleep(3000);
		driver.close();
		login1=null;
		login2=null;
		home=null;
		
	}
	
	
	
	
	
}
