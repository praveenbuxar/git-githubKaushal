package testScripts;

import org.testng.annotations.Test;

import components.HMS_PR_Method;
import utility.BaseClass;

public class HMS_PR_Scenario extends BaseClass
{
	HMS_PR_Method method=new HMS_PR_Method(readData);
	@Test(description="scenario:1-test the functionality of consumer with valid flow")
	  public void f() throws Exception
	  {
		  System.out.println("Entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\HMS_PR_REG_retesting.xlsx", "1");
		  method.launchApp();
		  method.userLoginPage();
		  method.links();
		  method.emergencyRegPage();
	
	  }
	}
