package ashot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImg {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		WebElement logoElement=driver.findElement(By.xpath("//div/div[@id='divLogo']/img"));
		Screenshot LogoImagesScreenshot=new AShot().takeScreenshot(driver, logoElement);
		ImageIO.write(LogoImagesScreenshot.getImage(),"png",new File("C://Software/LogoImages/OrangeHRMlogo.png"));
		
		File f = new File("C://Software/LogoImages/OrangeHRMlogo.png");
		if(f.exists())
		{
			System.out.println("Image file Captured");
		}
		else
		{
			System.out.println("Image file NOT exist");
		}
		

	}

}
