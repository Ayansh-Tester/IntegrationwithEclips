package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://apt.anthem.com/");
		WebElement we = driver.findElement(By.id("USDomainID"));
		we.sendKeys("Admin");
		
		Actions act = new Actions(driver);
		act.doubleClick(we).build().perform();
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.chord(Keys.CONTROL,"C"));
		driver.findElement(By.id("Password")).sendKeys(Keys.chord(Keys.CONTROL,"V"));
	}

}
