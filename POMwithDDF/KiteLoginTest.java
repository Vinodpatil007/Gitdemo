package POMwithDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://kite.zerodha.com/");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		
		login1.clickKiteLogin1PageLoginBtn();
		Thread.sleep(2000);
		
		KiteLogin2Page login2 =new KiteLogin2Page(driver);
		login2.InpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.ClickKiteLogin2PageContBtn();
		
		KiteHomePage home=new KiteHomePage(driver);
		home.VerifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(2000);
		driver.close();	
	
	}
}
