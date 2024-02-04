package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup4_switchTo_childBrowser2 {
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://skpatro.github.io/demo/links/");
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click on new window from main page
		d.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Thread.sleep(2000);
		
		//get address of child window
		Set<String> multipleids = d.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(multipleids);
	
		//switch to child window
		d.switchTo().window(al.get(1));
		
		Thread.sleep(2000);
		//perform action on child window
		d.manage().window().maximize();
		
		d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	


}

}