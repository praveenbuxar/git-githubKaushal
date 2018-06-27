package TestNG;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Broken_Links 
{
	public WebDriver driver;
  @Test
  public void f() 
  {
	  List<WebElement>links=driver.findElements(By.tagName("a"));
	  System.out.println("total links are"+links.size());
	  for(int i=0;i<links.size();i++)
	  {
		  WebElement ele=links.get(i);
		  String url=ele.getAttribute("href");
		  verifyLinkActive(url);
	  }
	  
  }
  public void verifyLinkActive(String linkURL)
  {
	  try
	  {
		  URL url=new URL(linkURL);
		  HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
		  httpURLConnection.setConnectTimeout(3000);
		  httpURLConnection.connect();
		  if(httpURLConnection.getResponseCode()==200)
		  {
			  System.out.println(linkURL+"-"+httpURLConnection.getResponseMessage());
		  }
		  if(httpURLConnection.getResponseCode()==httpURLConnection.HTTP_NOT_FOUND)
		  {
			  System.out.println(linkURL+"-"+httpURLConnection.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
		  }
	  }
	  catch(Exception e)
	  {
		  
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.co.in");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
