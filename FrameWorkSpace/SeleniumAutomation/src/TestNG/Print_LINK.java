package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Print_LINK 
{
	public WebDriver driver;
	
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Perminent Registration")).click();
  }
  	public void links()
  	{
	  List<WebElement> str=driver.findElements(By.tagName("select"));
	  System.out.println(str.size());
	  for(int i=0;i<str.size();i++)
	  {
		  if(str.get(i).getText().equalsIgnoreCase(""))
		  {
			  System.out.println(str.get(i).getText());
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://localhost/hms");
  }

  @AfterTest
  public void afterTest() {
  }

}
