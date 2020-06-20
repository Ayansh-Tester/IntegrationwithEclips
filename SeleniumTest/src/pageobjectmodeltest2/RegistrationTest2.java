package pageobjectmodeltest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class RegistrationTest2 {

		public void VerifyFlightReg()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		RegistrationPage2 rp= new RegistrationPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		rp.clickRegLink();
		rp.setFirstName("pavan");
		rp.setLastName("kumar");
		rp.setPhone("8142402254");
		rp.setEmail("pavan@gmail.com");
		rp.setAddress("Abcd");
		rp.setCity("HYDERABAD");
		rp.setState("AP");
		rp.setPostelCode("50074");
		rp.setUsername("PAVAN");
		rp.setPassword("pavan");
		rp.setConfirmPassword("pavan");
		rp.clickRegBtn();
		
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Your registrered sucessfully-Test case got pass");
		}
		else
		{
			System.out.println("Your registration failed");
		}
		
		}
	}


