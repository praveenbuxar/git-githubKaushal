package ERP_Login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CreateItemMaster 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  new Select(driver.findElement(By.id("user_language"))).selectByVisibleText("English");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='user_login']/ul/li[4]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Inventory")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='path_by_module']/div/div[2]/ul[1]/li[1]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("item_id")).click();
	  driver.findElement(By.xpath(".//*[@id='tabsHeader-1']/ul/li[2]/i")).click();
	  Thread.sleep(2000);
	  
	  //move to child window
	  
	  Set<String>window=driver.getWindowHandles();
	  System.out.println("popup names are"+window);
	  Object[]s=window.toArray();
	  driver.switchTo().window(s[1].toString());
	  Thread.sleep(2000);
	  driver.findElement(By.id("search_submit_btn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='tabsLine-0']/table/tbody/tr[2]/td[2]/a")).click();
	  Thread.sleep(2000);
	  
	  //back to main window
	  
	  Set<String>mainwindow=driver.getWindowHandles();
	  System.out.println("popup names are"+window);
	  Object[]s1=mainwindow.toArray();
	  driver.switchTo().window(s1[0].toString());
	  
	  new Select(driver.findElement(By.id("item_type"))).selectByVisibleText("Equipment");
	  new Select(driver.findElement(By.id("uom_id"))).selectByVisibleText("HR");
	  new Select(driver.findElement(By.id("item_status"))).selectByVisibleText("Engineering");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Manufacturing")).click();
	  
	  new Select(driver.findElement(By.id("make_buy"))).selectByVisibleText("MAKE");
	  
	  driver.findElement(By.xpath(".//*[@id='save']")).click();
	  
	  
	  
	 
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost/erp/");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
