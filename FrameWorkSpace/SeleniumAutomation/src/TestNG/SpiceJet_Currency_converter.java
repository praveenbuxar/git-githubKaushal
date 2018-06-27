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

public class SpiceJet_Currency_converter 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  //driver.findElement(By.id(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Varanasi (VNS)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("30")).click();
	  new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("1 Adult");
	  new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("1 Child");
	  new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("1 Infant");
	  new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	  Thread.sleep(2000);
	  driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
  }
  @Test
  public void popup()
  {
	  String str;
	  str=driver.getWindowHandle();
	  driver.findElement(By.id("popUpConverter")).click();
	  driver.switchTo().window("converter");
	  new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	  new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Saudi Riyal(SAR)");
	  driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("1000");
	  driver.findElement(By.name("CurrencyConverterCurrencyConverterView$ButtonConvert")).click();
	  //driver.switchTo().alert().getText();
	  driver.close();
	  driver.switchTo().window(str);
  }
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	 // System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new ChromeDriver();
	  //driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() throws Exception 
  {
	  driver.quit();
	  Thread.sleep(2000);
  }

}
