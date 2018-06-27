package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGuru99Login 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  Guru99Login login=new Guru99Login(driver);
	  login.loginToGuru99("kaushal", "kaushal123");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/v4/");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
