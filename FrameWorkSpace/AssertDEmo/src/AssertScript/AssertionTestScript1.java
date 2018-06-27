package AssertScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

public class AssertionTestScript1 
{
	public WebDriver driver;
  @Test
  public boolean isUserLoginSuccesfully() 
  {
	  SoftAssert assertion=new SoftAssert();
	  driver.findElement(By.id("email")).sendKeys("kaushal.mandal000@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("iamfool");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  Assert.assertEquals("facebook", driver.getTitle());
	  Assert.assertTrue(isUserLoginSuccesfully(), "user login to failed");
	  assertion.assertAll();
	  return true;
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
