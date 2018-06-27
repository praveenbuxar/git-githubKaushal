package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_FEEDBACK 
{
	public WebDriver driver;
  @Test
  public void verfifyLogin()throws Exception 
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  
  }
  @Test
  public void clickFeedback() throws Exception
  {
	  String str;
	  str= driver.getWindowHandle();//  main window
	  driver.findElement(By.linkText("Feedback")).click();
	  driver.switchTo().window("mywindow");//navigating to child window
	  driver.findElement(By.id("name")).sendKeys("kaushal");
	  driver.findElement(By.id("email")).sendKeys("kaushal.mandal000@gmail.com");
	  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");
	  driver.close();
	  driver.switchTo().window(str);
	  driver.findElement(By.linkText("ADT")).click();
	  Thread.sleep(2000);
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://selenium4testing.com/hms/");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
