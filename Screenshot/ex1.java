package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;





public class ex1 {

	public static void main(String[] args) throws IOException{
		
	
	System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
	
	WebDriver d = new ChromeDriver();
    
	d.get("https://en-gb.facebook.com/");
	
	
	
	File s = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
	System.out.println(s);
	
	File a = new File("E:\\vinod patil\\velocity\\screenshot");
 
	FileHandler.copy(s, a);
	
	
		}
}
