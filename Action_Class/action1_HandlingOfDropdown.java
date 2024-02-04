package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action1_HandlingOfDropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("https://www.flipkart.com/");

		Thread.sleep(7000);
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//button[text()='✕']")).click();

		Thread.sleep(7000);
		
		//Step 1
		WebElement logbutton = d.findElement(By.xpath("//a[text()='Login']"));

		//Step 2
		
		Actions act=new Actions(d);
		
		//Step 3
		
		act.moveToElement(logbutton).perform();
		
		









}

}
