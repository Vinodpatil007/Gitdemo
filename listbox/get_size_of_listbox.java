package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_size_of_listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\ ");
		WebDriver driver =new ChromeDriver ();
		driver.get ("hhtp:www.facebook.com");
		driver.findElement(By.xpath("a[text()='create new account']")).click();
		Thread.sleep(3000);
		 WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));
		Select s =new Select(month);
	 List<WebElement> multioptions = s.getOptions();
	System.out.println(multioptions.size());
	System.out.println(s.getOptions().size());
	
		
	}

}
