package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KiteLogin1Page_usingSimplePom {

	// 1. declaration
		private WebElement UN; 	// private WebElement UN = driver.findElement(By.xpath("xpath xpression"))
		private WebElement pwd; 	// private WebElement pwd = driver.findElement(By.xpath("xpath xpression"))
		private WebElement login; // private WebElement login = driver.findElement(By.xpath("xpath xpression"))

		//2. initialization
		public KiteLogin1Page_usingSimplePom(WebDriver driver) 
		{
			UN= driver.findElement(By.xpath("//input[@id='userid']"));
			pwd= driver.findElement(By.xpath("//input[@id='password']"));
			login= driver.findElement(By.xpath("//button[@class='button-orange wide']"));
			
		}
		
		//3. usage
		public void enterUN()
		{
			UN.sendKeys("DV1510");
		}
		
		public void enterPWD()
		{
			pwd.sendKeys("Year@123");
		}
		
		public void clickOnLoginBtn() {
			login.click();
		}

}
