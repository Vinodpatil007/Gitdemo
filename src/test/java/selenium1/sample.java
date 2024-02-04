package selenium1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class sample {
		public static void main(String[] args) throws InterruptedException {
			

		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.booking.com//");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='search'] ")).sendKeys("Goa");

		driver.findElement(By.xpath("(//span[contains(@class,'sb-date-field')])[1] ")).click();
		driver.findElement(By.xpath("//div[@data-bui-ref='calendar-next'] ")).click();
		driver.findElement(By.xpath("(//span[text()='27'])[1] ")).click();
		driver.findElement(By.xpath("(//span[text()='26'])[2]")).click();

		driver.findElement(By.xpath("//label[@class='xp__input']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.xpath("//select[@name='age']")).click();
		driver.findElement(By.xpath("(//option[@value='10'])[3] ")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


		driver.findElement( By.xpath("(//div[@class='sb-date-field__display'])[2]")).click();
		driver.findElement( By.xpath("(//span[text()='20'])[2]")).click();
		
		driver.close();

		
		}
		
	}


