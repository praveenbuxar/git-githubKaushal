package ERP_TESTNG;

import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class US1103 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  new Select(driver.findElement(By.id("user_language"))).selectByVisibleText("English");
	  driver.findElement(By.name("submitLogin")).click();
  }
  public void inventory() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='dashborad_menu']/li[1]/a/i")).click();
	  Thread.sleep(2000);
  }
  public void verifyInventory()
  {
	List<WebElement> str=driver.findElements(By.tagName("a"));
	System.out.println(str.size());
	for(int i=0;i<str.size();i++)
	{
		if(!str.get(i).getText().equalsIgnoreCase(""))
		{
			System.out.println(str.get(i).getText());
		}
	}
  }
  public void wlogout() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("LogOut")).click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/erp/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
