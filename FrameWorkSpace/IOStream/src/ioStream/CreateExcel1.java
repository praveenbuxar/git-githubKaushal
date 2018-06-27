package ioStream;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class CreateExcel1 {
  @Test
  public void f() throws Exception
  {
	  SimpleDateFormat df=new SimpleDateFormat("YYYY_MMMM_dd_hh_mm_ss a ");
	  Date d=new Date();
	  String time=df.format(d);
	  System.out.println(time);
	  FileOutputStream fo=new FileOutputStream(".\\testData\\result"+time+".xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fo);
	  WritableSheet ws=wb.createSheet("ResultSheet",0);
	  Label un=new Label(0, 0, "username");
	  ws.addCell(un);
	  Label pw=new Label(1, 0, "password");
	  ws.addCell(pw);
	  Label rs=new Label(2, 0, "result");
	  ws.addCell(rs);
	  wb.write();
	  wb.close();
  }
}
