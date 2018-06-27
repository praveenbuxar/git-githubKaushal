package udemyProject;

import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class def 
{
	public WebDriver driver;
	@Test
	public void Atest() 
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Test
	public void Btest()
	{
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@BeforeTest
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms");
		
	}
  

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }
  }


