package testScripts;

import org.testng.annotations.Test;

import components.HMSEmergencyMethod;
import utility.BaseClass;

public class HMSEmergencyScenario extends BaseClass
{
	HMSEmergencyMethod method=new HMSEmergencyMethod(readData);
	@Test(description="scenario:1-test the functionality of consumer with valid flow")
	  public void f() throws Exception
	  {
		  System.out.println("Entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\HMSEmergency.xlsx", "1");
		  method.launchApp();
		  method.userLoginPage();
		  method.links();
		  method.emergencyRegPage();
	
	  }
	}
