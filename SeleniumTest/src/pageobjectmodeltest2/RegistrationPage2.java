package pageobjectmodeltest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 
{ 
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT , using="REGISTER")
	WebElement RegLink;
	@FindBy(how=How.NAME, using="firstName")
	WebElement FirstName;
	@FindBy(how=How.NAME,using="lastName")
	WebElement LastName;
	@FindBy(how=How.NAME,using="phone")
	WebElement Phone;
	@FindBy(how=How.NAME,using="userName")
	WebElement Email;
	@FindBy(how=How.NAME,using="address1")
	WebElement Address1;
	@FindBy(how=How.NAME,using="city")
	WebElement City;
	@FindBy(how=How.NAME,using="state")
	WebElement State;
	@FindBy(how=How.NAME,using="postalCode")
	WebElement PostalCode;
	@FindBy(name="country")
	WebElement Country;
	@FindBy(name="email")
	WebElement UserName;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="confirmPassword")
	WebElement ConfirmPassword;
	@FindBy(name="register")
	WebElement RegistrationBtn;
	
	RegistrationPage2(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void clickRegLink()
	{
		RegLink.click();
	}
	public void setFirstName(String fname)
	{
		FirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		LastName.sendKeys(lname);
	}
	public void setPhone(String pn)
	{
		Phone.sendKeys(pn);
	}
	public void setEmail(String mail)
	{
		Email.sendKeys(mail);
	}
	public void setAddress(String addr)
	{
		Address1.sendKeys(addr);
	}
	public void setCity(String cty)
	{
		City.sendKeys(cty);
	}
	public void setState(String state)
	{
		State.sendKeys(state);
	}
	public void setPostelCode(String ps)
	{
		PostalCode.sendKeys(ps);
	}
	public void setUsername(String username)
	{
		UserName.sendKeys(username);
	}
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);		
	}
	public void setConfirmPassword(String confirmpassword )
	{
		ConfirmPassword.sendKeys(confirmpassword);
	}
	public void clickRegBtn()
	{
		RegistrationBtn.click();
	}
	

}
