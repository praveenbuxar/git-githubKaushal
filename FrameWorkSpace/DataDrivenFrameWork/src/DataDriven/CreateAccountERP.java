package DataDriven;

import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CreateAccountERP 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception 
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\CreateAccountERP.xls");
	  Workbook  w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  for(int c=3;c<s.getColumns();c++)
	  {
	  for(int i=1;i<s.getRows();i++)
	  {
		  if(s.getCell(2, i).getContents().equalsIgnoreCase("url"))
		  {
			  driver.get(s.getCell(0, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("wait"))
		  {
			  Thread.sleep(2000);
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("button"))
		  {
			  driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("link"))
		  {
			  driver.findElement(By.linkText(s.getCell(0, i).getContents())).click();
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
		  {
			  driver.findElement(By.xpath(s.getCell(0, i).getContents())).sendKeys(s.getCell(c, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents().equalsIgnoreCase("alert"))
		  {
			  if(s.getCell(3, i).getContents().equalsIgnoreCase("ok"))
			  {
				  driver.switchTo().alert().accept();
			  }
			  else if(s.getCell(3, i).getContents().equalsIgnoreCase("cancel"))
			  {
				  driver.switchTo().alert().dismiss();
			  }
		  }
	  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
