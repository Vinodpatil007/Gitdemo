package POMWith_TestNG;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_DDF_Using_TestNG {

	WebDriver driver;
	Sheet sh;
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
        FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		driver = new ChromeDriver(options);
		
		
		driver.get("https://kite.zerodha.com/");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 login1 = new KiteLogin1Page(driver);
		 login2 = new KiteLogin2Page(driver);
		 home=new KiteHomePage(driver);
		
		
	}
	
	
	
	@BeforeMethod
	public void LogintoApplication() {
		login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1PageLoginBtn();
		login2.InpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
	    login2.ClickKiteLogin2PageContBtn();
		
	}
	
	
	@Test
	public void verifyProfileName() {
		
		String actUserID = home.getKiteHomePageUserID();
		String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
		
		Assert.assertEquals(actUserID, expUserID,"actUserID & expUserID are diffrent");
		
		
		
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
