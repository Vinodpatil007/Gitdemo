package Screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class practice {

	public static void main(String[] args) throws IOException  {
				
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\\\java\\chromedriver exe file\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");

		String r = RandomString.make(2);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\java\\Screenshot\\img"+r+".jpg");
		
		FileHandler.copy(src, dest);
		
	}
}
