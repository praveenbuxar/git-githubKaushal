package testScripts;

import org.testng.annotations.Test;

import utility.BaseClass;
import components.ERP_Login_method;

public class ERP_LoginScenario extends BaseClass
{
	ERP_Login_method login=new ERP_Login_method(readData);
	//@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f() throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\ERP.xlsx", "1");
	//  initializeRepository();
	  login.launchApp();
	  login.login();
	  login.logout();

  }
}
