package HMS_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.beust.jcommander.Parameter;

public class HMS_Login

{
	
	public WebDriver driver;

  @Test
  public void f() 
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
  }
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String str) 
  {
	  if(str.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/hms/");
	  }
	  else if(str.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://localhost/hms/");

	  }
  }
  

  @AfterTest
  public void afterTest() {
  }

}
