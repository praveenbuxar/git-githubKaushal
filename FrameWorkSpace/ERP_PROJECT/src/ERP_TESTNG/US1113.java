package ERP_TESTNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class US1113 
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
	  driver.findElement(By.xpath(".//*[@id='dashborad_menu']/li[3]/a/i")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='path_by_module']/div/div[2]/ul[1]/li[3]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='big_popover']/i")).click();
	  Thread.sleep(2000);
	  Set<String>window=driver.getWindowHandles();
	  System.out.println("popup windows name"+window);
	  Object[]s=window.toArray();
	  driver.switchTo().window(s[0].toString());
	  driver.findElement(By.id("search_submit_btn")).click();
	  driver.findElement(By.xpath(".//*[@id='tabsLine-0']/table/tbody/tr[2]/td[2]/a")).click();
	  //switch to main window
	  Set<String>window1=driver.getWindowHandles();
	  System.out.println("main window name are"+window1);
	  Object[]s1=window1.toArray();
	  driver.switchTo().window(s1[0].toString());
	  driver.findElement(By.xpath(".//*[@id='save']")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost/erp/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
