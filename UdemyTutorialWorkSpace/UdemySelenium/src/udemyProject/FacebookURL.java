package udemyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookURL 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
  }
}
