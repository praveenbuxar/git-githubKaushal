package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpiceJet_Links 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  List<WebElement>str=driver.findElements(By.tagName("a"));
	  System.out.println("total links are"+str.size());
	  for(int i=0;i<str.size();i++)
	  {
		  if(!str.get(i).getText().equalsIgnoreCase(""))
		  {
			  System.out.println(str.get(i).getText());
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://book2.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
