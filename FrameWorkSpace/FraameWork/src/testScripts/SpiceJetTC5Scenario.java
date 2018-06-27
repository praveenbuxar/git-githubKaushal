package testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import components.SpiceJetTC5Method;
import utility.BaseClass;

public class SpiceJetTC5Scenario extends BaseClass
{
	SpiceJetTC5Method method=new SpiceJetTC5Method(readData);
	//@Parameters("TestCaseNo")
	  @Test(description="verify the availabilty of origin leaving from field")
	  public void f() throws Exception 
	  {
		  System.out.println("entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\SpiceJet.xlsx", "3");
		  method.launchApp();
		  method.homePage();
		 
	  }
	}


