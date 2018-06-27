package ERP_Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginWithMultipleBrowser 
{
	public WebDriver driver;
	
  @Test
  public void f() throws Exception 
  {
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  
  }
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String str) 
  {
	  if(str.equals("firefox"))
	  {
		 System.setProperty("webdriver..gecko.driver", "D:\\library\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("http://localhost/erp/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  else if(str.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://localhost/erp/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  }

  @AfterTest
  public void afterTest() {
  }

}
