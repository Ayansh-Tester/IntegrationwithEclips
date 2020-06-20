package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpperAlphaTest 
{
	public static void main(String[] arg)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        WebElement test=driver.findElement(By.id("enterText"));
        
        Actions act = new Actions(driver);
        act.moveToElement(test)
        .keyDown(Keys.SHIFT)
        .sendKeys(test," hi jay")
        .keyUp(Keys.SHIFT).build().perform();
        
        
	

	}

}
