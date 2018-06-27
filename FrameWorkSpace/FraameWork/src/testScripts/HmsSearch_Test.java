package testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class HmsSearch_Test extends utility.BaseClass {

	public components.HmsSearch_BusinessFunction HMSRegistration=new components.HmsSearch_BusinessFunction(readData);
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
		reportDetails.put("Test Script Type", "User Acceptance Testing");
		reportDetails.put("Requirement Document ID of System", "Doc1234567");
		reportDetails.put("Requirement ID", "US2202");
	}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:6 -  Test the permanent registration form in hms")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\TestData.xlsx", no);
	  initializeRepository();
	  HMSRegistration.launchApp();
	  HMSRegistration.login();
	  HMSRegistration.Permanent_Registration();
	 
  }
}
