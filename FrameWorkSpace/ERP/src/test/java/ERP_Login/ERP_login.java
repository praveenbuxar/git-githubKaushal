package ERP_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ERP_login 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/erp/");
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  new Select(driver.findElement(By.id("user_language"))).selectByVisibleText("English");
	  driver.findElement(By.name("submitLogin")).click();
	  driver.close();
	  
  }
}
