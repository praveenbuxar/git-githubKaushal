package DataDriven;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DriverScript 
{
	WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\HMSPR.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  for(int i=0;i<s.getRows();i++)
	  {
		  if(s.getCell(2, i).getContents().equalsIgnoreCase("dropdown"))
		  {
			  new Select(driver.findElement(By.name(s.getCell(0, i).getContents()))).selectByVisibleText(s.getCell(3, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
		  {
			  driver.findElement(By.name(s.getCell(0, i).getContents())).sendKeys(s.getCell(3, i).getContents());
		  }
		  
	  }
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost/hms/");
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Perminent Registration")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
