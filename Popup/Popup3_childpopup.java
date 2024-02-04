package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3_childpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@name='NewTab']")).click();
	
		Thread.sleep(2000);
		
		//get id of child window
		Set<String> multipleids = d.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(multipleids);
		
		String addressofchildwindow = al.get(1);
		
		//System.out.println(addressofchildwindow);
		
		//switch to child browser window
		d.switchTo().window(addressofchildwindow);
		
		d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
	}
	
	
	
}
