package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
		Thread.sleep(3000);
		
		//click on click me button
		d.findElement(By.xpath("//button[text()='Click me!']")).click();

		Thread.sleep(3000);
		
		//switch to alert
		Alert alt = d.switchTo().alert();
	
		String text = alt.getText();
	

		System.out.println(text);
	
		alt.accept();
	
		//alt.dismiss();
		
	
	}
	
	
}
