package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage(WebDriver driver)
	 {
		 super(driver);
	 }
	
	// Elements
	@FindBy(xpath="//a[text()='Log out']")
	WebElement msgLogout;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement linkLogout;
	
	public void clickLogout()
	{
		linkLogout.click();
	}
	
	
	public boolean isMyAccountexist()
	{
		try {
			return(msgLogout.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
	}
	
	
	
	
}
