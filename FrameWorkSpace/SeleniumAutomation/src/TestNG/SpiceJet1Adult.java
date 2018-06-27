package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpiceJet1Adult 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();//clicking one way button
	  Thread.sleep(2000);
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//clicking leaving from
	  //Thread.sleep(2000);
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();//selecting agartala
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Delhi (DEL)")).click();//selecting delhi
	  driver.findElement(By.linkText("16")).click();//selecting date
	  new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByVisibleText("1 Adult");//selecting 1 adult
	  Thread.sleep(2000);
	  new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");//select currency
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']")).click();//click search button
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
