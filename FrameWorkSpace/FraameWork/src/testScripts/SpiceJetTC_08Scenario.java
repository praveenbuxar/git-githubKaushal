package testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import components.SpiceJetTC_08Method;
import utility.BaseClass;

public class SpiceJetTC_08Scenario extends BaseClass
{
	SpiceJetTC_08Method method=new SpiceJetTC_08Method(readData);
	@Parameters("TestCaseNo")
	  @Test(description="scenario:4 test the functionality of the consumer with valid flow")
	  public void f(String no) throws Exception 
	  {
		  System.out.println("entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\SpiceJet.xlsx", no);
		  method.launchApp();
		 
		  method.homePage();
		  //method.capturesnapshot("D:\\FrameWorkSpace\\ScreenShot");
	  }
	}
