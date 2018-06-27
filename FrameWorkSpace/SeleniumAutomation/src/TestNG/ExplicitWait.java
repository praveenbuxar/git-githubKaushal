package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExplicitWait 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	  WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	  boolean status=element.isDisplayed();
	  if(status)
	  {
		  System.out.println("the element is displayed");
	  }
	  else
	  {
		  System.out.println("the element is not displayed");
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
