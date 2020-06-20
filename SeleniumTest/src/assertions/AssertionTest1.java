package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest1 
{
	@Test
	public void DemoTest1()
	{
		Assert.assertTrue(true);
		Assert.assertEquals("Jay", "Jay");
		Assert.assertEquals("selenium", "selenium");
		System.out.println("Successfully passed");
	}
	
	

}
