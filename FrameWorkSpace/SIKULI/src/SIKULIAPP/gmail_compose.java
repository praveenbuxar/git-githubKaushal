package SIKULIAPP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class gmail_compose 
{
	public WebDriver driver;
	Screen s=new Screen();
  @Test
  public void f() throws Exception
  {
	 driver.findElement(By.id("Email")).sendKeys("kaushal.mandal000@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.id("next")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("Passwd")).sendKeys("kaushal123");
	 driver.findElement(By.id("signIn")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id=':f2']/div/div")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id=':l1']")).sendKeys("kaushalmandal9999@gmail.com");
	 driver.findElement(By.xpath(".//*[@id=':md']")).click();
	 Thread.sleep(2000);
	 s.click("D:\\library\\SIKULI_IMAGE.sikuli\\thispc.png");
	 s.type("D:\\library\\SIKULI_IMAGE.sikuli\\filename.png","D:\\library\\kaushal.png");
	 s.click("D:\\library\\SIKULI_IMAGE.sikuli\\open.png");
	 Thread.sleep(2000);
	
	 driver.findElement(By.xpath(".//*[@id=':kb']")).click();
	 driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://mail.google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
