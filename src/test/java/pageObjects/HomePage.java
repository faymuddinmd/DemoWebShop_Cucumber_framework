package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	 {
		 super(driver);
	 }
	 
	//Elements
	@FindBy(xpath ="//a[text()='Log in']")
	WebElement myLogin;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement myReg;
	
	// Action methods
	public void clickLogin()
	{
		myLogin.click();
	}
	
	public void clickReg()
	{
		myReg.click();
	}
	

}
