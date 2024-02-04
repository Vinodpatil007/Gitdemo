package HandlingOf_DynamicElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();

		d.get("https://www.amazon.in/");

		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("apple 12");

		d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

		String rating = d.findElement(By.xpath("((//div[@class='rush-component'])[1]//span)[15]")).getText();

		System.out.println(rating);



}

}
