package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HAndleFrame 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.id("username")).sendKeys("9470527246");
	  driver.findElement(By.id("password")).sendKeys("kaushal123");
	  driver.findElement(By.id("loginBTN")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='button'and @value='Skip']")).click();
	  //Thread.sleep(1000);
	  //driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@class='button br3']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
	  Thread.sleep(1000);
	  driver.switchTo().frame("frame");
	  driver.findElement(By.id("mobile")).sendKeys("9470527246");
	  driver.findElement(By.id("greet2")).click();
	  driver.findElement(By.id("Send")).click();
	  driver.switchTo().defaultContent();
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://site23.way2sms.com/content/prehome.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
