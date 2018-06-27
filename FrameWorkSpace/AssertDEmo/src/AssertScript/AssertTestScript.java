package AssertScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AssertTestScript 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.id("email")).sendKeys("kaushal.mandal000@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("iamfool");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  Assert.assertEquals("facebook", driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	
  }

  @AfterTest
  public void afterTest() {
  }

}
