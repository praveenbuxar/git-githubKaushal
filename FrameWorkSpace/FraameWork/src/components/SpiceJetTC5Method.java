package components;



import objectRepository.SpiceJetTC5Locator;
import utility.BaseClass;
import utility.ReadData;

public class SpiceJetTC5Method extends BaseClass
{
	SpiceJetTC5Locator locator=new SpiceJetTC5Locator();
	 ReadData readData=new ReadData();
	public SpiceJetTC5Method(ReadData readData)
	{
		this.readData=readData;
	}
	public void launchApp() throws Exception{
		try{
			openBrowser("chrome");
		openURL(readData.testDataValue.get("AppURL"));
		wait(2000);
		}
		catch(Exception e)
		{
			  log.fatal("Unable to open the URL"+e.getMessage());
		}
	}
	public void homePage()throws Exception
	{
		click(locator.roundTrip);
		Thread.sleep(2000);
		waitForElement(locator.leavingFrom, 10);
		click(locator.leavingFrom);
		String str=printText(locator.leavingfromfields);
		System.out.println(str);
	}
	

}
