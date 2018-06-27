package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest 
{
	public WebDriver driver;
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver","D:\\library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	    
	}

	@When("^I enter valid username and password$")
	public void I_enter_valid_username_and_password() throws Throwable 
	{
		driver.findElement(By.id("email")).sendKeys("kaushal.mandal000@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("iamfool");
	    
	}

	@Then("^user should be login succesfully$")
	public void user_should_be_login_succesfully() throws Throwable 
	{
		driver.findElement(By.id("loginbutton")).click();
	    
	}



}
