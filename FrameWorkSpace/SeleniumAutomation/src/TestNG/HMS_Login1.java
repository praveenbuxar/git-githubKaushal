package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_Login1 
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
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost/hms/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
