package pageoblectmodeltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class RegistrationTest 
{
	public void VerifyFlightReg()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	RegistrationPage RGPage= new RegistrationPage(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	RGPage.clickonReglink();
	RGPage.setFirstName("pavan");
	RGPage.setLastName("kumar");
	RGPage.setPhone("8142402254");
	RGPage.setEmail("pavan@gmail.com");
	RGPage.setAddress1("Nizampet");
	RGPage.setAddress2("Kukatpally");
	RGPage.setCity("HYDERABAD");
	RGPage.setState("AP");
	RGPage.setPostalCode("50074");
	RGPage.setCountry("INDIA");
	RGPage.setUserName("PAVAN");
	RGPage.setPasswoard("pavan");
	RGPage.setConfrmPasswoard("pavan");
	RGPage.clickReg();
	
	if(driver.getPageSource().contains("Thank you for registering"))
	{
		System.out.println("Your registrered sucessfuuly-Test case goted pass");
	}
	else
	{
		System.out.println("Your registration failed");
	}
	}

	}


