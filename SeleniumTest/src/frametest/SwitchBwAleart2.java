package frametest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBwAleart2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String ExpTextOK="You pressed Ok";
		String ExptextCANCEL="You Pressed Cancel";
		driver.switchTo().alert().accept();
		String ActText=driver.findElement(By.xpath("//p[text()='You pressed Ok']")).getText();
		if(ExpTextOK.equals(ActText)==true)
		{
			System.out.println("Test is passed");
		}
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		 ActText=driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).getText();
		
		if(ExptextCANCEL.equals(ActText)==true)
		{
			System.out.println("Test is Passed");
		}
		

	}

}
