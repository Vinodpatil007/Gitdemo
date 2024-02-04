package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example9_Keywords_Timeout {

	@Test (timeOut = 5000)
	public void TC1() throws InterruptedException{
	Thread.sleep(7000);
	Reporter.log("--running TC1--",true);
   }

}