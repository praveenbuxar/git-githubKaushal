package SIKULIAPP;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SIkuliSample 
{
	Screen s=new Screen();
  @Test
  public void f() throws Exception
  {
	  s.click("D:\\library\\SIKULI_IMAGE.sikuli\\navigate.png");
  }
}
