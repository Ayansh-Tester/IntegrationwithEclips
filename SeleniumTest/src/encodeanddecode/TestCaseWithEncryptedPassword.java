package encodeanddecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedPassword 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jayhindgupta82@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("d2VsY29tZUBAMQ=="));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
		static String decodeString(String password)
		{
			byte[] decodedString=Base64.decodeBase64(password);
			return(new String(decodedString));
			
			
		}
		String expected="Welcome, Please Sign In!";
		
		String act="Welcome, Please Sign In!";
		{
			if(expected.equals(act))
			{
				System.out.println("Test Cases got passed succefully");
			}
		}
	}


