package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_WithoutDDF {

	//Username : DV1510
	//Password: Year@123
	//Pin: 959594
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver d =new ChromeDriver();
		
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
