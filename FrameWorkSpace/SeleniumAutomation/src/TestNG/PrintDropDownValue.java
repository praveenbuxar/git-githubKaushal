package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintDropDownValue 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  String id="ctl00$mainContent$ddl_Adult";
	  List<WebElement> str=new Select(driver.findElement(By.id(id))).getOptions();
	  System.out.println(str.size());
	  for(int i=0;i<str.size();i++)
	  {
		  if(str.get(i).getText().contains("5 Adults"))
		  {
			  System.out.println(str.get(i).getText());
			  new Select(driver.findElement(By.id(id))).selectByVisibleText(str.get(i).getText());
		  }
		  if(!str.get(i).getText().contains("5 Adults"))
		  {
			  System.out.println(str.get(i).getText());
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://spicejet.com/");
	  }

  @AfterTest
  public void afterTest() {
  }

}
