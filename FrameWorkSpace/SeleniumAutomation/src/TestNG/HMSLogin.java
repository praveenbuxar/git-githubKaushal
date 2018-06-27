package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMSLogin 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
