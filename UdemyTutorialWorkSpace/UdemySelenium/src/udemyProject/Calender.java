package udemyProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Calender 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.xpath("(//input[@class='checkSpecialCharacters'])[1]")).click();
	  List<WebElement>day=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
	  for(int i=0;i<day.size();i++)
	  {
		  String text=day.get(i).getText();
		  if(text.equalsIgnoreCase("23"))
		  {
			  day.get(i).click();
			  break;
		  }
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
