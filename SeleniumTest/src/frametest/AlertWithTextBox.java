package frametest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("Hi Jay !");
		
		String ExpText="Hello Hi Jay ! How are you today";
		driver.switchTo().alert().accept();
		
		String ActText=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		
		if(ExpText.equals(ActText)==true)
		{
			System.out.println("Test is passed");
		}
		
		//driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		//driver.switchTo().alert().dismiss();
		

	}

}
