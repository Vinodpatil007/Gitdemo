package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		//switch to frame
	    //d.switchTo().frame(0); //int index
		
	   //d.switchTo().frame("iframeResult"); // string Frameid
	   //d.switchTo().frame("iframeResult");  //string framename
		
		WebElement frame = d.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		d.switchTo().frame(frame);
	
		d.findElement(By.xpath("//button[@type='button']")).click();
	
		d.switchTo().defaultContent();  
		
		d.findElement(By.xpath("//a[@id='tryhome']")).click();
	
	}

}
