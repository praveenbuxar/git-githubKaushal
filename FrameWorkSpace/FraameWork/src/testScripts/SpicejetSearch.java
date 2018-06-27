package testScripts;

import objectRepository.Spicejet_Search_Locator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SpicejetSearch extends utility.BaseClass{

	public components.Spicejet_search_BusinessFunction Spicejet=new components.Spicejet_search_BusinessFunction(readData);
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
	@Test(description = "Scenario:5 - Test the one way search in spicejet.com")
  public void f(String no) throws Exception {
	  System.out.println("Entered in the test method..................");
	  readData.readTestDataFile(System.getProperty("user.dir")	+ "D:\\FrameWorkSpace\\FraameWork\\Resources\\SpiceJet.xlsx", no);
	  initializeRepository();
	  
	  Spicejet.launchApp();
	  Spicejet.find_flight();
	 
  }
}
