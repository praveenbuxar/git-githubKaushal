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

public class SpiceJetSearch_TEstNG 
{
	public WebDriver driver;
  @Test
  public void verifySearch() throws Exception
  {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Ahmedabad (AMD)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Belagavi (IXG)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("29")).click();
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2 Adults");
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("0 Infant");
	  new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	  Thread.sleep(2000);
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
  }
  @BeforeTest
  public void beforeTest()throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
