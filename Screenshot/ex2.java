package Screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;



public class ex2 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
	    
		d.get("https://retail.onlinesbi.com/retail/login.htm");
		
		String r = RandomString.make(2);
		
	  File f = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
	  System.out.println(f);
	  
	  File b= new File("E:\\java\\Screenshot\\image"+r+".jpg");
	  
	  FileHandler.copy(f, b);
	  
	}

}
