package TestNG;

import java.io.File;
import java.io.IOException;
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

public class SpiceJetTC4 
{
	public WebDriver driver;
	public void takeScreenShot() throws Exception
	{
		SimpleDateFormat df=new SimpleDateFormat("YYYY_MMMM_dd hh_mm_ss a");
		Date d=new Date();
		String time=df.format(d);
		System.out.println(time);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("D:\\seleniumAutomationWorkSpace\\Framework\\"+".png"));
	}
  @Test
  public void f() throws Exception 
  {
	  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	  takeScreenShot();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
