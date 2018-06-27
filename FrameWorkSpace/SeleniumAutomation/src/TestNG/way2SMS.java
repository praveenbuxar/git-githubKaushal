package TestNG;

import java.util.concurrent.TimeUnit;

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
	 // driver.switchTo().frame("lgnFrm");
	  //Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("9470527246");
	  driver.findElement(By.id("password")).sendKeys("kaushal123");
	  driver.findElement(By.xpath(".//*[@id='loginBTN']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("html/body/div[7]/div[1]/ul/li[2]/a")).click();
	  driver.switchTo().frame("frame");
	  driver.findElement(By.id("mobile")).sendKeys("7386664392");
	  //driver.findElement(By.id("message")).sendKeys("hi this is kaushal");
	  driver.findElement(By.id("greet2")).click();
	  driver.findElement(By.id("Send")).click();
	  driver.switchTo().defaultContent();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://site23.way2sms.com/content/index.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
