package testScripts;

import org.testng.annotations.Test;

import components.CreateAccountERPMethod;

import utility.BaseClass;

public class CreateAccountERPScenario extends BaseClass
{
	CreateAccountERPMethod method=new CreateAccountERPMethod(readData);
	
  @Test(description="scenario:1-test the functionality of consumer with valid flow")
  public void f() throws Exception
  {
	  System.out.println("Entered in test method");
	  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\CreateAccountERP.xlsx", "1");
	  method.loginRegister();
	  method.newAccount();
  }
}
