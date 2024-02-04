package Framework;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_WithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		String actPN = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	
		String expPN = sh.getRow(0).getCell(3).getStringCellValue();
		
		if (actPN.equals(expPN)) {
			System.out.println("pass");
		}
		else {
			System.out.println("faill");
		}
	}
	
	
	
}
