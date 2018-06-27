package components;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import objectRepository.SpiceJetTC_08Locator;
import utility.BaseClass;
import utility.ReadData;

public class SpiceJetTC_08Method  extends BaseClass
{
	SpiceJetTC_08Locator locator=new SpiceJetTC_08Locator();
	public SpiceJetTC_08Method(ReadData readData)
	{
		this.readData=readData;
	}
	public void takeScreenShot(String str) throws Exception
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\FrameWorkSpace\\ScreenShot\\"+str+".png"));
	}

	
	public void launchApp() throws Exception{
		try{
			openBrowser("firefox");
		openURL(readData.testDataValue.get("AppURL"));
		wait(2000);
		}
		catch(Exception e)
		{
			  log.fatal("Unable to open the URL"+e.getMessage());
		}
	}
	public void homePage() throws Exception
	{
		click(locator.oneWay);
		click(locator.from);
		wait(2000);
		click(locator.origin);
		wait(2000);
		click(locator.destination);
		wait(2000);
		click(locator.date);
		select(locator.adult, readData.testDataValue.get("ADULT"));
		wait(2000);
		select(locator.currency,readData.testDataValue.get("CURRENCY"));
		click(locator.findFlight);
		
		
		
	}


}
