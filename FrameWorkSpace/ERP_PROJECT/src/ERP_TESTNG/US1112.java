package ERP_TESTNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class US1112 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  new Select(driver.findElement(By.id("user_language"))).selectByVisibleText("English");
	  driver.findElement(By.name("submitLogin")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//*[@id='dashborad_menu']/li[2]")).click();
	  driver.findElement(By.linkText("Pick List")).click();
	  driver.findElement(By.xpath(".//*[@id='big_popover']/i")).click();
	  Thread.sleep(1000);
	  Set<String>window=driver.getWindowHandles();
	  System.out.println("popup names are"+window);
	  Object[]s=window.toArray();
	  driver.switchTo().window(s[0].toString());
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath(".//*[@id='search_submit_btn']")).click();
	  driver.findElement(By.xpath(".//*[@id='tabsLine-0']/table/tbody/tr[2]/td[2]/a")).click();
	  Set<String>window1=driver.getWindowHandles();
	  System.out.println("Parent window names are"+window1);
	  Object[]s1=window1.toArray();
	  driver.switchTo().window(s1[0].toString());
	  Thread.sleep(2000);
	 // driver.switchTo().alert().accept();
	  driver.findElement(By.xpath(".//*[@id='save']")).click();
	  driver.switchTo().alert().accept();
	  driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[6]/div/div/ul/li[8]/a")).click();
	  
	  
	  
	  
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
