package ioStream;

import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.Test;

public class ReadData_excel {
  @Test
  public void printData() throws Exception 
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\HMSLogin.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  
	  //to print specific cell data
	  System.out.println(s.getCell(0, 0).getContents());
	  System.out.println(s.getCell(1, 0).getContents());
	  System.out.println(s.getCell(0, 1).getContents());
	  System.out.println(s.getCell(1, 1).getContents());
	  
	  //to print both columns
	  for(int i=0;i<s.getRows();i++)
	  {
		  System.out.println(s.getCell(0, i).getContents());
		  System.out.println(s.getCell(1, i).getContents());
	  }
	  //to print all columns
	  for(int i=0;i<s.getRows();i++)
	  {
		  for(int j=0;j<s.getColumns();j++)
		  {
			 System.out.println(s.getCell(j, i).getContents());
		  }
	  }
  }
}
