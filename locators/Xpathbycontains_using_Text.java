package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains_using_Text {

	//d.findElement(By.xpath("//tagname[contains(text(),'text value')]"))

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://en-gb.facebook.com/");
		
		d.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		
		d.findElement(By.xpath("//a[contains(text(),'Login Password')]")).click();
		
		// d.get("https://en-gb.facebook.com/");
		
		// d.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		
	}	
}
