package DataDriven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class CreateHTML 
{
  @Test
  public void f() throws Exception 
  {
	  File f=new File("D:\\library\\Files_3Sample.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);	
	  
bw.write("<table cellpadding='2' cellspacing='1' border='2'>");
bw.write("<tbody>");
bw.write("<tr>");
bw.write("<td><font size='6' face='bold' color='green'>");
bw.write("app");
bw.write("</font></td>");
bw.write("<td><font size='6' face='bold' color='red'>");
bw.write("Nagesh");
bw.write("</font></td>");
bw.write("</tr>");
bw.close();


  }
}


  
