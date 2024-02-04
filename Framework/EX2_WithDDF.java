package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX2_WithDDF {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
        System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver d =new ChromeDriver();
		
		d.get("https://kite.zerodha.com/");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter UN
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		d.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
		//enter PWD
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
				
		//Click on Login
	    d.findElement(By.xpath("//button[text()='Login ']")).click();
				
		//enter PIN
	    String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		d.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
				
		//click on cnt
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		//verify profile name
		String actPN = d.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expPN = sh.getRow(0).getCell(3).getStringCellValue();
		
		if(actPN.equals(expPN)) 
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	}
	
}
