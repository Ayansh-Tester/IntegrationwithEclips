package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedNIsEnabledTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://apt.anthem.com/");
		
		WebElement UserID=driver.findElement(By.name("USDomainID"));
		WebElement Password= driver.findElement(By.name("Password"));
		
		if(UserID.isDisplayed() && UserID.isEnabled())
		{
			UserID.sendKeys("Af83576");
		}
		
		if(Password.isDisplayed() && Password.isEnabled())
		{
			Password.sendKeys("Jay@123456");
		}

	}

}
