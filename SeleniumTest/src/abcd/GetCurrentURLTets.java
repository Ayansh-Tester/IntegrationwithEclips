package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLTets {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://savvytime.com/converter/est-to-ist");
		//String actUrl="https://savvytime.com/converter/est-to-ist";
		String str=driver.getCurrentUrl();
		String str2= driver.getPageSource();
		System.out.println(str);
		System.out.println(str2);
	}

}
