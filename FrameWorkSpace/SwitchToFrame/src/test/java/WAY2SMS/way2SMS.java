package WAY2SMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class way2SMS 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys("9470527246");
	  driver.findElement(By.id("password")).sendKeys("kaushal123");
	  driver.findElement(By.id("loginBTN")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
	  Thread.sleep(2000);
	  driver.switchTo().frame("frame");
	  driver.findElement(By.id("mobile")).sendKeys("9470527246");
	  driver.findElement(By.id("greet1")).click();
	  driver.findElement(By.xpath(".//*[@id='Send']")).click();
	  driver.switchTo().defaultContent();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://site23.way2sms.com/content/index.html");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
