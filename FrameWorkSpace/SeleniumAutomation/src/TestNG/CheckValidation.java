package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CheckValidation 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  boolean b,c,d;
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	  b=driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_0']")).isDisplayed();
	  if(b==true)
	  {
		  System.out.println("the element is displaying");
	  }
	  else
	  {
		  System.out.println("the element is not displaying");
	  }
	  c=driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isEnabled();
	  if(c==true)
	  {
		  System.out.println("the element is enabled");
	  }
	  else
	  {
		  System.out.println("the element is disabled");
	  }
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Delhi (DEL)")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver","D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
