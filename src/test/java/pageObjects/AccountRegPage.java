package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage
{

	public AccountRegPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	//Elements
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement txtFirstname;

	@FindBy(xpath="//input[@name='LastName']")
	WebElement txtLastname;

	@FindBy(xpath="//input[@id='Email']")
	WebElement txtemail;

	@FindBy(xpath="//input[@name='Password']")
	WebElement txtpwd;

	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement txtConfpwd;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement reg;
	
	@FindBy(xpath="//div[@class='result']")
	WebElement msgconfirm;
	
	
	//Action methods
	
	public void inputfirstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void inputlastname(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void inputemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void inputpwd(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}

	public void inputconfpwd(String confpwd)
	{
		txtConfpwd.sendKeys(confpwd);
	}
	
	public void inputreg()
	{
		reg.click();
	}
	
	public String msgconfirmation()
	{
		try {
			return(msgconfirm.getText());
		}catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}
