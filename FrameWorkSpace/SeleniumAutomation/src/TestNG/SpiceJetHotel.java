package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpiceJetHotel 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.linkText("Hotels")).click();
	  driver.findElement(By.xpath("//input[@id='MySpiceTripSearchView_TextBoxMarketOrigin1'and class='required ui-autocomplete-input WM']")).sendKeys("Bangalore");
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://book2.spicejet.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
