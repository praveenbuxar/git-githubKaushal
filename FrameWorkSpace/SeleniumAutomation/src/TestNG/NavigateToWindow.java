package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NavigateToWindow
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.linkText("Bugzilla")).click();
	  driver.navigate().to("http://selenium4testing.org/");
	  driver.findElement(By.id("Bugzilla_login")).sendKeys("nag010683@yahoo.in");
	  driver.findElement(By.id("Bugzilla_password")).sendKeys("selenium");
	  Thread.sleep(1000);
	  driver.findElement(By.id("log_in")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/");
	  Thread.sleep(1000);
  }

  @AfterTest
  public void afterTest() {
  }

}
