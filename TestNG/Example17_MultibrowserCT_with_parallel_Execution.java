package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example17_MultibrowserCT_with_parallel_Execution {

	@Parameters("browsername")
	@Test
	public void TC(String browsername) throws InterruptedException {
		
		WebDriver d=null;
		if (browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Eclipse2\\April21A_Selenium\\Browser\\chromedriver.exe");
			
			d=new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","E:\\java\\geckodriver.exe\\");
			
			d=new FirefoxDriver();
			
		}
d.get("https://kite.zerodha.com/");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter UN
		d.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		//enter PWD
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
		
		//Click on Login
		d.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter PIN
		d.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		//click on cnt
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//Verify profile name
		String actPN = d.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expPN = "DV1510";
		
		if (actPN.equals(expPN)) {
			
			System.out.println("Pass");
		}
		
		else {
			
			System.out.println("Fail");
		}
		
	}
	

	
}
