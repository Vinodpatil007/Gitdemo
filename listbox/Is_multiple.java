package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_multiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver", "path of exe file ");
		WebDriver driver = new ChromeDriver();
		driver.get ("http:www.facebook.com");
		Thread.sleep(3000);
		//step 1
		
	 WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));
		Select s = new Select (month);
	 boolean result =s.isMultiple();
	 System.out.println(result);
	 if (result)
	 {System.out.println("given listbox is mutiltiple");}
	 else
	 { {System.out.println("given listbox is not multiple");
	 }}
	}

}
