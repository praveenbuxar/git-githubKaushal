package SpiceJetScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpiceJet1 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Ahmedabad (AMD)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Delhi (DEL)")).click();
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
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
