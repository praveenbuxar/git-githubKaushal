package udemyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest 
{
	public WebDriver driver;
  @Test(priority=3)
  public void ATest() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
		
		
  }
  @Test(priority=1)
  public void BTest()
  {
	  driver.findElement(By.name("password")).sendKeys("admin");
 }
  @Test(priority=2)
  public void CTest() throws InterruptedException
  {
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  Thread.sleep(5000);
  }
  @Test(enabled=false)
  public void DTest()
  {
	  System.out.println("Selenium");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms/");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
