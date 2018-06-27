package ScriptDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gmailSmokeTest 
{
	public WebDriver driver;
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver","D:\\library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	   
	}

	@When("^i enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable 
	{
		driver.findElement(By.id("Email")).sendKeys("kaushal.mandal000@gmail.com");
		
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("kaushal123");
		driver.findElement(By.id("signIn")).click();
	    
	}

	@Then("^user should be able to login succesfully$")
	public void user_should_be_able_to_login_succesfully() throws Throwable 
	{
		driver.close();
	    
	}


}
