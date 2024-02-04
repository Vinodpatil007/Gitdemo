package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_linkText_n_artiallnktext {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();

		d.get("file:///E:/java/HTML/Linktext.html");
		
		d.findElement(By.linkText("facebook")).click();

		Thread.sleep(1000);
		
d.navigate().back();

Thread.sleep(1000);
   d.findElement(By.partialLinkText("book")).click();

}		

}
