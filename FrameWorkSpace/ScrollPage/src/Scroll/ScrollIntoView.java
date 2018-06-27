package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ScrollIntoView 
{
	public WebDriver driver;
  @Test
  public void scrollView() 
  {
	  JavascriptExecutor je=(JavascriptExecutor)driver;
	  WebElement element=driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
	  je.executeScript("arguments[0].scrollIntoView(true);",element);
	  System.out.println(element.getText());
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
