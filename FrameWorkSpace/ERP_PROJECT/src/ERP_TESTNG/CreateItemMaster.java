package ERP_TESTNG;

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
	  driver.findElement(By.name("submitLogin")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Inventory")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='path_by_module']/div/div[2]/ul[1]/li[1]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/div/form/div[1]/div/div/div[1]/ul/li[2]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/div/form/div[1]/div/div/div[1]/ul/li[2]/i")).click();
	  Thread.sleep(2000);
	  Set<String> str=driver.getWindowHandles();
	  Object s[]=str.toArray();
	  driver.switchTo().window(s[1].toString());
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div/ul[2]/li[10]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr[1]/td[2]/a")).click();
	  Thread.sleep(2000);
	  driver.switchTo().window(s[0].toString());
	  Thread.sleep(2000);
	  new Select(driver.findElement(By.id("org_id"))).selectByVisibleText("MAS");
	  new Select(driver.findElement(By.id("item_type"))).selectByVisibleText("Equipment");
	  new Select(driver.findElement(By.id("uom_id"))).selectByVisibleText("HR");
	  new Select(driver.findElement(By.id("item_status"))).selectByVisibleText("Active");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Manufacturing")).click();
	  new Select(driver.findElement(By.id("make_buy"))).selectByVisibleText("BUY");
	  Thread.sleep(2000);
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
  public void afterTest() {
  }

}
