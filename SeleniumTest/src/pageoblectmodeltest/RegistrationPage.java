package pageoblectmodeltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage
{
	WebDriver driver;
	
	By RegLink=By.linkText("REGISTER");
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By Phone=By.name("phone");
	By Email=By.id("userName");
	By Address1=By.name("address1");
	By Address2=By.name("address2");
	By City=By.name("city");
	By State=By.name("state");
	By PostalCode=By.name("postalCode");
	By Country=By.name("country");
	By UserName=By.id("email");
	By Passwaord=By.name("password");
	By ConfirmPass=By.name("confirmPassword");
	By RegBtn=By.name("register");
	
	RegistrationPage (WebDriver d)
	{
		driver=d;
	}
	public void clickonReglink()
	{
		driver.findElement(RegLink).click();
	}
	public void setFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	public void setPhone(String ph)
	{
		driver.findElement(Phone).sendKeys(ph);
	}
	public void setEmail(String mail)
	{
		driver.findElement(Email).sendKeys(mail);
	}
	public void setAddress1(String addr1)
	{
		driver.findElement(Address1).sendKeys(addr1);
	}
	public void setAddress2(String addr2)
	{
		driver.findElement(Address2).sendKeys(addr2);
	}
	public void setCity(String ci)
	{
		driver.findElement(City).sendKeys(ci);
	}
	public void setState(String cty)
	{
		driver.findElement(State).sendKeys(cty);
	}
	public void setPostalCode(String pc)
	{
		driver.findElement(PostalCode).sendKeys(pc);
	}
	public void setCountry(String cn)
	{
		WebElement con=driver.findElement(Country);
		Select drop= new Select(con);
		drop.selectByVisibleText(cn);
	}
	public void setUserName(String userName)
	{
		driver.findElement(UserName).sendKeys(userName);
	}
	public void setPasswoard(String passwrd)
	{
		driver.findElement(Passwaord).sendKeys(passwrd);
	}
	public void setConfrmPasswoard(String passwrd)
	{
		driver.findElement(ConfirmPass).sendKeys(passwrd);
	}
	public void clickReg()
	{
		driver.findElement(RegBtn).click();
	}
	
	
	
	
	
	

	}


