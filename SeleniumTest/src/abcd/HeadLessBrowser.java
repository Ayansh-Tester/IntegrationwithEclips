package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
         
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.sarkariresult.com/");
	    System.out.println("Title of the page :"+driver.getTitle());
		
		
	}

}
