package SIKULIAPP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GmailScenario 
{
	public WebDriver driver;
	Screen s=new Screen();
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.id("Email")).sendKeys("akumarkaushal56@gmail.com");
	  driver.findElement(By.id("next")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("Passwd")).sendKeys("kaushal123");
	  driver.findElement(By.id("signIn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id=':4e']/div/div")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id(":9w")).sendKeys("kaushal.mandal000@gmail.com");
	  driver.findElement(By.id(":9g")).sendKeys("resume");
	  driver.findElement(By.id(":b9")).click();
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://accounts.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
