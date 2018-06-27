package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class PrintAndAddDataToCreateFile {
  @Test
  public void f() throws Exception 
  {
	  FileInputStream fi=new FileInputStream(".\\testData\\HMSLogin.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  FileOutputStream fo=new FileOutputStream(".\\testData\\LoginRes.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fo);
	  WritableSheet ws=wb.createSheet("result", 0);
	  for(int i=0;i<s.getRows();i++)
	  {
		  Label result=new Label(2, i, "pass");
		  ws.addCell(result);
		  
		  for(int j=0;j<s.getColumns();j++)
		  {
			  System.out.println(s.getCell(j, i).getContents());
			  Label l=new Label(j, i, s.getCell(j, i).getContents());
			  ws.addCell(l);
		  }
		  
	  }
	  Label rs=new Label(2, 0, "results");
	  ws.addCell(rs);
	  wb.write();
	  wb.close();
	  
  }
}
