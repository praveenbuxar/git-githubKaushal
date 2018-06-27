package testScripts;

import org.testng.annotations.Test;

import components.CreateItemMasterMethod;
import utility.BaseClass;

public class CreateItemMasterScenario  extends BaseClass
{
	CreateItemMasterMethod method=new CreateItemMasterMethod(readData);
	@Test(description="scenario:1-test the functionality of consumer with valid flow")
	  public void f() throws Exception
	  {
		  System.out.println("Entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\ERP.xlsx", "2");
		  method.launchApp();
		  method.userLoginPage();
		  method.userDashBoard();
		  method.itemDetails();
		  method.save();
	  }
	}
