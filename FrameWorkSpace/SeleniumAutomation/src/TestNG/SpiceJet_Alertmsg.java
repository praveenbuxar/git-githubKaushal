package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpiceJet_Alertmsg 
{
	public WebDriver driver;
  /**
 * @throws Exception
 */
@Test
  public void verifyAlert() throws Exception 
  {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Bagdogra (IXB)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Goa (GOI)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("30")).click();
	  new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("9 Adults");
	  new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("1 Child");
	  new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("0 Infant");
	  new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	  Thread.sleep(2000);
	  driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
  }
@Test
public void getAlertMsg()throws Exception
{
	String str;
	str=driver.switchTo().alert().getText();
	System.out.println(str);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
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
