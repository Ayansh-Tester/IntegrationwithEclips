package assertions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestAssertion {

	@Test
	public void LOginTest() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		WebElement usernametext=driver.findElement(By.name("userName"));
		WebElement passtext= driver.findElement(By.name("password"));
		
		// This is to check whether the text box is displayed or not
		// Test will continue only if the below statemt is true
		
		Assert.assertTrue(usernametext.isDisplayed());
		usernametext.sendKeys("mercury");
		
		Assert.assertTrue(passtext.isDisplayed());
		passtext.sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		// Validation
		
		String ExpTitle = "Find a Flight: Mercury Tours:";
		Assert.assertEquals(ExpTitle, driver.getTitle());
		
		
		
		driver.close();
		

	}

}
