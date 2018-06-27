package testScripts;

import org.testng.annotations.Test;

import components.PrintAllFieldInventoryMethod;
import utility.BaseClass;

public class PrintAllInventoryfieldScenario extends BaseClass
{
	PrintAllFieldInventoryMethod method =new PrintAllFieldInventoryMethod(readData);
	 @Test(description="scenario:1-test the functionality of consumer with valid flow")
	  public void f() throws Exception
	  {
		  System.out.println("Entered in test method");
		  readData.readTestDataFile("D:\\FrameWorkSpace\\FraameWork\\Resources\\ERP.xlsx", "1");
		  method.launchApp();
		  method.userLoginPage();
	  }
	}