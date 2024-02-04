package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example12_Verification {

	@Test
	public void TC1() {
		
	boolean actResult=true;
	Assert.assertFalse(actResult,"act result is true");
	}
	
	//@Test
	//public void TC1() {
		
	//boolean actResult=false;
	//Assert.assertTrue(actResult,"act result is false");
	//}
	
	//@Test
	//public void TC() {
	//	String actResult="hi";
	//	String expResult="hello";
	//	Assert.assertEquals(actResult, expResult,"both result are diff");
	//}
	
	//@Test
	//public void TC() {
	//	String actResult="hi";
	//	String expResult="hi";
	//	Assert.assertNotEquals(actResult, expResult,"both result are same");
	//}
	
}
