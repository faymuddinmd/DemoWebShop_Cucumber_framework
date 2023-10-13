package stepDefinitions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class steps 
{
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage mp;
	
	List <HashMap<String,String>> datamap;
	ResourceBundle rb;
	String br;
	@Before
	public void setup() 
	{
		rb = ResourceBundle.getBundle("config");
		br = rb.getString("browser");
		
	}
	
	@After
	public void TearDown(Scenario scenario)
	{
		System.out.println("Scenario status====>"+scenario.getStatus());
		if(scenario.isFailed()) {
			byte[] screenshot=(( TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		    scenario.attach(screenshot, "image/png", scenario.getName());
		}
		driver.quit();
	}
	
	@Given("user launch browser")
	public void user_launch_browser() 
	{
		if (br.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver = new FirefoxDriver();	
		}
		else if(br.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
	}

	@Given("Open url {string}")
	public void open_url(String url) 
	{
		driver.get(url); 
	   driver.manage().window().maximize();
	}

	@Given("Click on Login")
	public void click_on_login() 
	{
		hp=new HomePage(driver);
	    hp.clickLogin();
	}

	@Given("Enter the Email as {string} and password as {string}")
	public void enter_the_email_as_and_password_as(String email, String pwd) 
	{
		lp = new LoginPage(driver);
		lp.inputemail(email);
		lp.inputpwd(pwd);
	    
	}

	@Given("Click on Login button")
	public void click_on_login_button() 
	{
		lp = new LoginPage(driver);
	    lp.clickLogin();
	}

	@Then("User navigate to Dashboard")
	public void user_navigate_to_dashboard() 
	{
	    mp = new MyAccountPage(driver);
	    boolean targetpage = mp.isMyAccountexist();
		if(targetpage)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}


}
