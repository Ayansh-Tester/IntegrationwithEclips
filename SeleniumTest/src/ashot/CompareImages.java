package ashot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		
		BufferedImage expectedImage=ImageIO.read(new File("C://Software/LogoImages/OrangeHRMlogo.png"));
		
		WebElement logoImageElement=driver.findElement(By.xpath("//div/div[@id='divLogo']/img"));
		
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
		BufferedImage actualImage=logoImageScreenshot.getImage();
		
		ImageDiffer imgDiffer = new ImageDiffer();
		ImageDiff diff= imgDiffer.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true)
		{
			System.out.println("Image are NOT same");
		}
		else
		{
			System.out.println("Image are  same");
		}

	}

}
