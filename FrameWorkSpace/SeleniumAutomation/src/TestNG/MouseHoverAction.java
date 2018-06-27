package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MouseHoverAction 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	Actions a=new Actions(driver);  
	a.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
	driver.findElement(By.linkText("Careers ")).click();
	Thread.sleep(2000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	Thread.sleep(2000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	Thread.sleep(2000);
	
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
