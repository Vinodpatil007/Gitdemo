package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class custmoizedListbox_2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://en-gb.facebook.com/");

		//click on Create New Account btn
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//step1: identify listbox
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		
		//step2: create object of actions class
		Actions act=new Actions(d);
		
		//step3:  click on ele
		act.click(month).perform();
		
		Thread.sleep(2000);

		for (int i = 0; i <=13; i++) {
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		}
		
		//2. move to desired location
		for (int i = 1; i<=13; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(2000);
		}
		
		//3. select option --> enter
		act.sendKeys(Keys.ENTER).perform();

		













}
}
