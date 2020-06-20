package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Log4jExample {

	public static void main(String[] args) 
	{
		// Here we need to create logger instance so we need to pass Class Name
		Logger logger = Logger.getLogger("Log4jExample");
		
		 // configure log4j properties file
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		logger.info("Browser opened");
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		logger.info("Clock on Register");
		driver.findElement(By.linkText("REGISTER")).click();
		
		logger.info("Entering Contact Information");
		driver.findElement(By.name("firstName")).sendKeys("pavan");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("8142402254");
		driver.findElement(By.name("userName")).sendKeys("pavan@gmail.com");
		
		logger.info("Entering mailing information");
		driver.findElement(By.name("address1")).sendKeys("Nizampet");
		driver.findElement(By.name("address2")).sendKeys("kukatpally");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("AP");
		driver.findElement(By.name("postalCode")).sendKeys("500073");
		
		logger.info("Selecting Country");
		WebElement we=driver.findElement(By.name("country"));
		Select sel= new Select(we);
		sel.selectByVisibleText("INDIA");
		
		logger.info("Entering user informatation");
		driver.findElement(By.name("email")).sendKeys("training2");
		driver.findElement(By.name("password")).sendKeys("training1");
		driver.findElement(By.name("confirmPassword")).sendKeys("training1");
		driver.findElement(By.name("register")).click();
		
		logger.info("Validation Started");
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Your registrered sucessfully-Test case got pass");
			logger.info("Validation DONE");
		}
		else
		{
			System.out.println("Your registration failed");
			logger.info("Validation DONE");
		}
		
		
		
		
		

	}

}
