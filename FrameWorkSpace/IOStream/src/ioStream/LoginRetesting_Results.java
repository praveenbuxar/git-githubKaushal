package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginRetesting_Results 
{
	WebDriver driver;
	String str;
  @Test
  public void f() throws Exception
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\HMSLogin.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  
	  // to create the Result file
	  FileOutputStream fo=new FileOutputStream(".\\testReport\\HMSResult.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fo);
	  WritableSheet ws=wb.createSheet("result", 0);
	  
	  for (int i = 1; i < s.getRows(); i++) {
		  
		  try {
			driver.findElement(By.name("username")).sendKeys(s.getCell(0,i).getContents());
			  driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
			  driver.findElement(By.name("submit")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.linkText("Logout")).click();
			  str="pass";
		} catch (Exception e) {
			str="fail";
			driver.get("http://localhost/hms");
		}
		  Label  rs=new Label(2,i,str);
		  ws.addCell(rs);
		  
		  for (int j = 0; j < s.getColumns(); j++) {
			  Label l=new Label(j, i, s.getCell(j,i).getContents());
			  ws.addCell(l);
			
		}	  
		
	}
	  Label result=new Label(2, 0, "Result");
	  ws.addCell(result);wb.write();
	  wb.close();
	  
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost/hms");
  }

  @AfterTest
  public void afterTest() {
  }

}
