package components;

import objectRepository.SpiceJetTC6Locator;
import utility.BaseClass;
import utility.ReadData;

public class SpiceJetTC6Method extends BaseClass
{
	SpiceJetTC6Locator locator=new SpiceJetTC6Locator();
	public SpiceJetTC6Method(ReadData readData)
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
	public void homePage()
	{
		
	}
	

}
