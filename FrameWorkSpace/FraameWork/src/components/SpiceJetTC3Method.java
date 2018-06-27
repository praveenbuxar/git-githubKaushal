package components;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import objectRepository.SpiceJetTC3Locator;
import utility.BaseClass;
import utility.ReadData;

public class SpiceJetTC3Method  extends BaseClass
{
	SpiceJetTC3Locator locator=new SpiceJetTC3Locator();
	public SpiceJetTC3Method(ReadData readData)
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
		Thread.sleep(2000);
		takeScreenShot("oneWay");
		
	}

}
