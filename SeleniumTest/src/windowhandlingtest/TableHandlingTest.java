package windowhandlingtest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/AF83576/Desktop/Critical%20Illness%20and%20Accident/teabletest.html");
		int r =driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println(r);
		
		int c =driver.findElements(By.xpath("//tbody/tr/th")).size();
		System.out.println(c);
		
		for(int i=2;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
			}
			System.out.println();
		}

	}

}
