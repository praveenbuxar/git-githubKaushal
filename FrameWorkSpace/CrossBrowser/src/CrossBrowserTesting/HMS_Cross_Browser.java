package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_Cross_Browser 
{
	public WebDriver driver;
	@Parameters("browsers")
  @Test
  public void f() 
  {
	  driver.findElement(By.id("email")).sendKeys("kaushal.mandal000@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("iamfool");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  System.out.println(driver.getTitle());
  }
  @Parameters("browsers")
  @BeforeTest
  public void beforeTest(String browserName) 
  {
	  
	   if(browserName.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	  }
	   else if(browserName.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  //driver.quit();
  }

}
