package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginRetesting 
{
	WebDriver driver;
  @Test
  public void f() throws Exception 
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\HMSLogin.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  
	  for(int i=1;i<s.getRows();i++)
	  {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(2000);
		  	
		  try
		  {
			  driver.findElement(By.linkText("Logout")).click();
			  System.out.println("pass");
		  }
		  catch(Exception e)
		  {
			  System.out.println("fail");
			  driver.switchTo().alert().accept();
			  
		  }
			  
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost/hms/");
  }

  @AfterTest
  public void afterTest() 
  {
	 // driver.quit();
  }

}
