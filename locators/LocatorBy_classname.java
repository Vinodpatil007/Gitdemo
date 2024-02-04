package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBy_classname {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\program\\\\selenium\\\\java\\\\java\\\\chromedriver exe file\\\\chromedriver.exe\\\\");
		
		WebDriver d = new ChromeDriver(); 

		d.get("file:///E:/java/HTML/classname.html");
		
		// FN
		d.findElement(By.className("abc")).sendKeys("axs");
		
		// LN
		d.findElement(By.className("abc")).sendKeys("dde");
				
		
}
}
