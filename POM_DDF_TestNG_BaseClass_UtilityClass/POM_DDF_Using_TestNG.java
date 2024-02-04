package POM_DDF_TestNG_BaseClass_UtilityClass;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_DDF_Using_TestNG extends BaseClass {

	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
        		
		 initializeBrowser();		
		 login1 = new KiteLogin1Page(driver);
		 login2 = new KiteLogin2Page(driver);
		 home=new KiteHomePage(driver);
	}

	@BeforeMethod
	public void LogintoApplication() throws IOException {
		login1.inpKiteLogin1PageUsername(UtilityClass.getTestData(0, 0));
		login1.inpKiteLogin1PagePassword(UtilityClass.getTestData(0, 1));
		login1.clickKiteLogin1PageLoginBtn();
		login2.InpKiteLogin2PagePin(UtilityClass.getTestData(0, 2));
	    login2.ClickKiteLogin2PageContBtn();
	 }
	
	@Test
	public void verifyProfileName() throws IOException {
		int TCID = 100;
		String actUserID = home.getKiteHomePageUserID();
		String expUserID = UtilityClass.getTestData(0, 3);
		
		Assert.assertEquals(actUserID, expUserID,"actUserID & expUserID are diffrent");
	   UtilityClass.captureScreenshot(driver,TCID);
	}
	
	@AfterMethod
	public void logoutfromApplication() {
	
		Reporter.log("logout from app");
		
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
