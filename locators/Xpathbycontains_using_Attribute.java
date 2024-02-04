package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains_using_Attribute {

	//d.findElement(By.xpath("//tagname[contains(@Attribute name,'attribute value')]"))

		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
			
			WebDriver d = new ChromeDriver();
			
			d.get("https://en-gb.facebook.com/");
		
			
			d.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("xyz");
			
			// d.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("123");
			
			
			
		}
	
}
