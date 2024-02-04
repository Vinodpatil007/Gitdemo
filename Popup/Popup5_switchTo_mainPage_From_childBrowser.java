package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup5_switchTo_mainPage_From_childBrowser {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// click on newTab from main page
		d.findElement(By.xpath("//input[@name='NewTab']")).click();
	
		Thread.sleep(2000);
	
		//get child window id
		Set<String> multipleid = d.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(multipleid);
		
		//switch to child window
		d.switchTo().window(al.get(1));
		
		// click on Training from childbrowser popup
		d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
		//switch to main page
		d.switchTo().window(al.get(0));
		
		//click on new window
		d.findElement(By.xpath("//input[@name='NewWindow']")).click();
}
}