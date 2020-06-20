package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest 
{
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void DemoTest3()
	{
		softAssert.assertTrue(true);
		softAssert.assertEquals("Jay", "jay");
		softAssert.assertEquals("Selenium", "Selenium");
		System.out.println("Test case sucessfully passed");
		softAssert.assertAll();
		
	}
			

}
