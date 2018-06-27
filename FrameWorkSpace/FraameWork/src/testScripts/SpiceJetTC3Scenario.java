package testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import components.SpiceJetTC3Method;
import utility.BaseClass;

public class SpiceJetTC3Scenario extends BaseClass 
{
	SpiceJetTC3Method method=new SpiceJetTC3Method(readData);
	@Parameters("TestCaseNo")
  @Test(description="scenario:2 test the functionality of the consumer with valid flow")
  public void f(String no) throws Exception 
  {
	  System.out.println("entered in test method");
	  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\SpiceJet.xlsx", no);
	  method.launchApp();
	 
	  method.homePage();
	  method.capturesnapshot("D:\\FrameWorkSpace\\ScreenShot");
  }
}
