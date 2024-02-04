package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4_getIdOfMainPage {

		public static void main(String[] args) throws InterruptedException  {
			
			
			System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
			
			WebDriver d = new ChromeDriver();
			
			d.get("https://skpatro.github.io/demo/links/");
			
		
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

			Thread.sleep(2000);
			
			String mainpageid = d.getWindowHandle();
		
			System.out.println(mainpageid);
		
			
		}
	
		
	
	}
