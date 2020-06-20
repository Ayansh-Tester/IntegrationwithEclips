package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 
{
	@Test
	public void DemoTest2()
	{
		// If one test case got failed rest of the test case will not countinue is called Hard Assertion
		Assert.assertTrue(true);
		Assert.assertEquals("Jay", "Jay");
		Assert.assertEquals("Selenium", "selenium");
		Assert.assertEquals("Welcome", "Welcome");
		System.out.println("Successfully passed");
		
	}

}
