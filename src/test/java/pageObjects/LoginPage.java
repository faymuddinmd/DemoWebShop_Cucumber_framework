package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Element
	@FindBy(xpath="//input[@name='Email']")
	WebElement textemail;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement textpwd;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement butLogin;
	
	//Action methods
	public void inputemail(String email)
	{
		textemail.sendKeys(email);
	}
	
	public void inputpwd(String pwd)
	{
		textpwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		butLogin.click();
	}

}
