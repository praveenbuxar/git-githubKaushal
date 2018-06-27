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

public class PrintDropDownLOc
{
	public WebDriver driver;
  @Test
  public void login() throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
  }
  @Test
  public void permanentRegistration()throws Exception
  {
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Permanent Registration")).click();
  }
  @Test
  public void printDD_LOC()
  {
	  List<WebElement> str=(List<WebElement>) driver.findElement(By.tagName("select"));
	  System.out.println(str.size());
	  for(int i=0;i<str.size();i++)
	  {
		  System.out.println(str.get(i).getAttribute("name"));
	  }
  }
  @Test
  public void printTXT_BTN_LOC()
  {
	 List <WebElement> str=(List<WebElement>) driver.findElement(By.tagName("input"));
	 System.out.println(str.size());
	 for(int i=0;i<str.size();i++)
	 {
		 if(str.get(i).getAttribute("type").equalsIgnoreCase("text"))
		 {
			 System.out.println("txt bx loc"+str.get(i).getAttribute("name"));
		 }
		 else if(str.get(i).getAttribute("class").equalsIgnoreCase("log"))
		 {
			 System.out.println("btn loc"+str.get(i).getAttribute("value"));
		 }
	 }
  }
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms/");
	  login();
	  permanentRegistration();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
