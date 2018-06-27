package ERP_TESTNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import  org.apache.commons.io.FileUtils;

public class PrintAllInventoryFields 
{
	public WebDriver driver;
	public void takeScreenShot(String str) throws Exception
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f,new File("D:\\FrameWorkSpace\\ScreenShot\\"+str+".png"));
		//FileUtils.copyFile(f, new File("D:\\FrameWorkSpace\\ScreenShot"+str+".jpeg"));
        
	}
@Test
  public void f()  throws Exception
{
	driver.findElement(By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin");
	Thread.sleep(1000);
	new Select(driver.findElement(By.xpath(".//*[@id='user_language']"))).selectByVisibleText("English");
	driver.findElement(By.xpath(".//*[@id='user_login']/ul/li[4]/input")).click();
	Thread.sleep(2000);
	String str=driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/div/div/div/form/div/div")).getText();
	//System.out.println(str);
	String []s=str.split("\n");
	System.out.println(s.length);
	for(int i=0;i< s.length;i++){
	driver.findElement(By.linkText(s[i])).click();
	Thread.sleep(3000);
    takeScreenShot(s[i]);
    Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='header_top_quick_nav']/ul/li[4]/a/i")).click();
	Thread.sleep(2000);
	}
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://localhost/erp");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
