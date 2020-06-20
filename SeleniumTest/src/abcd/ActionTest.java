package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AF83576\\Downloads\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(ele);
		
		Actions act = new Actions(driver);
		
//		WebDriverWait wait = new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='demo-frame']")));
//		
		
		//List<WebElement> listOfItems = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		
	
		WebElement source=driver.findElement(By.xpath("//li[text()='Item 2']"));
		System.out.println("Element that is dragged : " + source.getText());
		//WebElement destination=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
		int x = driver.findElement(By.xpath("//li[text()='Item 6']")).getLocation().getX();
		int y = driver.findElement(By.xpath("//li[text()='Item 6']")).getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		act.dragAndDropBy(source, x,y).click().build().perform();
		
		
		

	}

}
