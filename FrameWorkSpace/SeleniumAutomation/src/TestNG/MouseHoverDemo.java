package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MouseHoverDemo 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  WebElement ele=driver.findElement(By.xpath("//button[@text()='Automation Tools']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  List<WebElement>links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
	  int total_count=links.size();
	  for(int i=0;i<total_count;i++)
	  {
		  WebElement element=links.get(i);
		  String text=element.getAttribute("innerHTML");
		  boolean status=element.isEnabled();
		  System.out.println("links name is"+text+"and the link status is"+status);
		  if(text.equalsIgnoreCase("Appium"))
		  {
			  element.click();
			  break;
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
