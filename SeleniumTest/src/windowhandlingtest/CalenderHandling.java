package windowhandlingtest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
     
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");

		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/flights.html");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("ddate")).click();
		String text=driver.findElement(By.xpath("//div[text()='Feb 2020']")).getText();
		System.out.println(text);*/
		
		
		driver.findElement(By.id("ddate")).click();
		
		
		for(int i=6;i>=1;i--)
		{
			
			
			String v= "\"NextPrevClick('nxtMnt')\"";
			String xpath = "//img[@onclick="+v+"]";
			driver.findElement(By.xpath(xpath+"[2]")).click();
			
			String m=driver.findElement(By.xpath("//div[@class='month2']")).getText();
			//String m=driver.findElement(By.xpath("//div[text()='Aug 2020']")).getText();
			System.out.println(m);
		
			if(m.equals("AUG 2020"))
			{
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				
				WebElement ele = driver.findElement(By.xpath("//li[@id='trd_3_12/08/2020']"));
				//wait.until(ExpectedConditions.elementToBeClickable(ele));
				Thread.sleep(3000);
				ele.click();
				break;
			}
			
		}
		
	}

}
