package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://en-gb.facebook.com/");
		
		
		////click on Create New Account btn
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//step1: identify listbox
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		
		//step2: create object of actions class
		Actions act=new Actions(d);
		
		//step3:  click on ele
		act.click(month).perform();
		
		Thread.sleep(2000);
		
		//step4: select option 
		//1. move 1 option upword
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(2000);
				
		//2. move 1 option downword
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		//3. select option-->ente
		act.sendKeys(Keys.ENTER).perform();
		}
}
