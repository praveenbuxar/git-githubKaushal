package testScripts;

import org.testng.annotations.Test;

import components.US1112_Method;
import utility.BaseClass;

public class US1112_Scenario  extends BaseClass
{
	US1112_Method method=new US1112_Method(readData);
	@Test(description="scenario:1-test the functionality of consumer with valid flow")
	  public void f() throws Exception
	  {
		  System.out.println("Entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\SalesDistribution.xlsx", "1");
		  method.loginRegister();
		  method.userLogin();
		  method.salesDistribution();
	  }
	}
