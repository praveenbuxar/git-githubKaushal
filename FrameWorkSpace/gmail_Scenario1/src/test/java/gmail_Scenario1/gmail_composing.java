package gmail_Scenario1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class gmail_composing 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.id("Email")).sendKeys("kaushal..mandal000@gmail.com");
	  driver.findElement(By.id("next")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("Passwd")).sendKeys("kaushal123");
	  Thread.sleep(2000);
	  driver.findElement(By.id("signIn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id=':f2']/div/div")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id=':l6']")).sendKeys("ranjitlnct@gmail.com");
	  driver.findElement(By.xpath(".//*[@id=':mi']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://mail.google.com/mail");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
