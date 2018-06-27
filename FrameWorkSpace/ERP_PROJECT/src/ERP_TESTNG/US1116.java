package ERP_TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class US1116 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  new Select(driver.findElement(By.id("user_language"))).selectByVisibleText("English");
	  driver.findElement(By.xpath("//input[@class='button btn btn-success']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Forecast & Planning")).click();
	  driver.findElement(By.linkText("Planning Control")).click();
	  Thread.sleep(1000);
	  new Select(driver.findElement(By.id("org_id"))).selectByVisibleText("Singapore");
	  Thread.sleep(1000);
	  new Select(driver.findElement(By.name("auto_consumed_group_id[]"))).selectByVisibleText("Mobile_L_15");
	  driver.findElement(By.xpath(".//*[@id='save']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("LogOut")).click();

  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/erp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  

  @AfterTest
  public void afterTest() {
  }

}
