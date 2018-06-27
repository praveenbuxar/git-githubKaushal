package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Guru99Login 
{
	public WebDriver driver;
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	 public Guru99Login(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 public void setUserName(String strusername)
	 {
		 username.sendKeys(strusername);
	 }
	 public void setPassword(String password)
	 {
		 pass.sendKeys(password);
	 }
	 public void clickLogin()
	 {
		 login.click();
	 }
	 
	 public void loginToGuru99(String strusername,String password )
	 {
		 this.setPassword(strusername);
		 this.setPassword(password);
		 this.clickLogin();
	}
}
