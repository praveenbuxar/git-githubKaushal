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

public class CreateItemMaster 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\CreateItemMaster.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  for(int i=0;i<s.getRows();i++)
	  {
		  if(s.getCell(2, i).getContents().equalsIgnoreCase("url"))
		  {
			  driver.get(s.getCell(0, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("button"))
		  {
			  driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("wait"))
		  {
			  Thread.sleep(2000);
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
		  {
			  driver.findElement(By.xpath(s.getCell(0, i).getContents())).sendKeys(s.getCell(3, i).getContents());
			  
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("dropdown"))
		  {
			  new Select(driver.findElement(By.xpath(s.getCell(0, i).getContents()))).selectByVisibleText(s.getCell(3, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("link"))
		  {
			  driver.findElement(By.linkText(s.getCell(0, i).getContents())).click();
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\seleniumLib\\geckodriver.exe");
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}