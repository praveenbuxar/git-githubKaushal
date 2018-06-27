package TestNG;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CaptureScreenShot1 
{
	public WebDriver driver;
	public void takeScreenShot(String str)throws Exception
	{
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MMM-dd hh_mm_ss a");
		Date d=new Date();
		String time=df.format(d);
		System.out.println(time);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\seleniumAutomationWorkSpace\\ScreenShot"+str+time+".png"));
	}
  @Test
  public void f() throws Exception 
  {
	  driver.findElement(By.linkText("Manual FAQs")).click();
	  takeScreenShot("mFAQs");
	  driver.findElement(By.linkText("Selenium FAQs")).click();
	  takeScreenShot("sFAQs");
	  driver.findElement(By.linkText("Core Java FAQs")).click();
	  takeScreenShot("cFAQs");
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://selenium4testing.com/");
	  driver.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
