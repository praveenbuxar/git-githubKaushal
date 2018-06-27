package HMS_Scenario;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMS_Registration 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath(".//*[@id='navigation']/li[1]/a")).click();
	  //Thread.sleep(2000);
	  driver.findElement(By.linkText("ADT")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Feedback")).click();
	  Thread.sleep(2000);
	  Set<String>window=driver.getWindowHandles();
	  System.out.println("windows name"+window);
	  Object[]s=window.toArray();
	  driver.switchTo().window(s[1].toString());
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys("kaushal");
	  driver.findElement(By.id("email")).sendKeys("kaushal.mandal000@gmail.com");
	  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Saab");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	  driver.findElement(By.xpath("html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("D:\\library\\kaushal.png");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[2]/div/div/form/p/button[1]")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://selenium4testing.com/hms/");
  }

  @AfterTest
  public void afterTest() {
  }

}
