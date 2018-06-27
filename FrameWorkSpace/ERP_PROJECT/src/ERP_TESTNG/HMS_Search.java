package ERP_TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_Search 
{
	public WebDriver driver;
  @Test
  public void test_01() throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
  }
  @Test
  public void test_02() throws Exception
  {
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Search Registration")).click();
	  Thread.sleep(2000);
	  
  }
  @Test
  public void test_03()
  {
	  driver.findElement(By.xpath("html/body/div[2]/div/div[2]/form/div/table/tbody/tr[1]/td[2]/input")).sendKeys("PR2690002545");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/hms");
  }

  @AfterTest
  public void afterTest() {
  }

}
