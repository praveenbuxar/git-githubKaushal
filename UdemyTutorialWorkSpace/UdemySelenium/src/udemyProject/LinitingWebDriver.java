package udemyProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LinitingWebDriver 
{
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("http://qaclickacademy.com/practice.php");
	 /* List<WebElement>links=driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  for(int i=0;i<links.size();i++)
	  {
		  System.out.println(links.get(i).getText());
	  }*/
	  
	  /*WebElement footer=driver.findElement(By.id("gf-BIG"));
	  List<WebElement>subfooter=footer.findElements(By.tagName("a"));
	  System.out.println(subfooter.size());
	  for(int i=0;i<subfooter.size();i++)
	  {
		  System.out.println(subfooter.get(i).getText());
	  }*/
	  
	  WebElement columnfooter=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	  List<WebElement>columnFooterLinks=columnfooter.findElements(By.tagName("a"));
	  for(int i=0;i<columnFooterLinks.size();i++)
	  {
		  String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		  columnFooterLinks.get(i).sendKeys(clickOnLinkTab);
		  Thread.sleep(5000);
		  
	  }
	  Set<String>window=driver.getWindowHandles();
	  Iterator<String>abc=window.iterator();
	  while(abc.hasNext())
	  {
		  driver.switchTo().window(abc.next());
		  Thread.sleep(2000);
		  System.out.println(driver.getTitle());
	  }
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumsoftware\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
