package udemyProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AllLinks 
{
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumsoftware\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://qaclickacademy.com/practice.php");
	  WebElement footer=driver.findElement(By.id("gf-BIG"));
	  List<WebElement>subfooter=footer.findElements(By.tagName("a"));
	  System.out.println(subfooter.size());
	  for(int i=0;i<subfooter.size();i++)
	  {
		  System.out.println(subfooter.get(i).getText());
	  }
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
