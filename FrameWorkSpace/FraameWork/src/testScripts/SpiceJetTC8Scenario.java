package testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import components.SpiceJetTC8Method;
import utility.BaseClass;

public class SpiceJetTC8Scenario extends BaseClass
{
	SpiceJetTC8Method method=new SpiceJetTC8Method(readData);
	@Parameters("TestCaseNo")
  @Test(description="scenario:4 test the functionality of the consumer with valid flow")
  public void f(String no) throws Exception 
  {
		System.out.println("entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\SpiceJet.xlsx", no);
		  method.launchApp();
		  method.adults();
	  
  }
}
