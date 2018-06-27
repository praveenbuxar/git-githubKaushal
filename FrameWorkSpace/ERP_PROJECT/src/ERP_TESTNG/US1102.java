package ERP_TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class US1102 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("New Account")).click();
	  driver.findElement(By.name("first_name[]")).sendKeys("kaushal");
	  driver.findElement(By.name("last_name[]")).sendKeys("mandal");
	  driver.findElement(By.name("username[]")).sendKeys("kaushalmandal");
	  driver.findElement(By.name("email[]")).sendKeys("kaushal.mandal000@gmail.com");
	  driver.findElement(By.id("enteredPassword")).sendKeys("kaushal123");
	  driver.findElement(By.id("enteredRePassword")).sendKeys("kaushal123");
	  driver.findElement(By.name("phone[]")).sendKeys("9470527246");
	  driver.findElement(By.name("newUser")).click();
  }
  public void homePage()
  {
	  driver.findElement(By.linkText("Home ")).click();
  }
  public void newCredential()
  {
	  driver.findElement(By.name("username")).sendKeys("kaushal");
	  driver.findElement(By.name("password")).sendKeys("kaushal123");
	  new Select(driver.findElement(By.id("user_language"))).selectByVisibleText("English");
	  driver.findElement(By.name("submitLogin")).click();
  }	
  public void signout() throws Exception
  {
	  driver.findElement(By.id("menu1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText(" LogOut")).click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/erp/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
