package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintDefaultValue_DropDown 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  Thread.sleep(2000);
	 // driver.findElement(By.linkText("Ahmedabad (AMD)")).click();
	  driver.findElement(By.linkText("Aizawl (AJL)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Kolkata (CCU)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("31")).click();
	  WebElement str=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getFirstSelectedOption();
	  System.out.println(str.getText());
	  if(str.getText().equalsIgnoreCase("1 Adult"))
	  {
		  System.out.println("default value is 1 adult");
	  }
	  else
	  {
		  System.out.println("default value is not 1 adult");
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
