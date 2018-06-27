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

public class SpiceJetSearch_8to11 
{
	public WebDriver driver;
	
  @Test
  public void search(String a,String c,String i)throws Exception 
  {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Agartala (IXA)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Pune (PNQ)")).click();
	  driver.findElement(By.linkText("31")).click();
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("a");
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("c");
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("i");
	  Thread.sleep(2000);
	  new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
  }
  @Test(description="verify the one way search functionality with 1 adult")
  public void test08() throws Exception
  {
	  search("1 Adult","0 Children","0 Infant");
  }
  @Test(description="verify the one way serach functionality with 2 adults and i child")
  public void test09() throws Exception
  {
	  search("2 Adults","1 Child","0 Infant");
  }
  @Test(description="verify the one way search functionality with 3 adult,2childrenand 1 infant")
  public void test10()throws Exception
  {
	  search("3 Adults","2 Children","1 Infant");
  }
  @Test(description ="verify the one way search functionality with more than 9 passenger")
  public void test11()throws Exception
  {
	  search("5 Adults","3 Children","2 Infants");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
  }

  @AfterTest
  public void afterTest()throws Exception 
  {
	  driver.quit();
	  Thread.sleep(2000);
  }

}
