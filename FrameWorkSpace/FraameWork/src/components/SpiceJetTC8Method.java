package components;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import objectRepository.SpiceJetTC8Locator;
import utility.BaseClass;
import utility.ReadData;

public class SpiceJetTC8Method extends BaseClass
{
	SpiceJetTC8Locator locator=new SpiceJetTC8Locator();
	public SpiceJetTC8Method(ReadData readData)
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
	public void adults() throws Exception
	{
		click(locator.adult);
		List<WebElement>str=driver.findElements(By.tagName("select"));
		System.out.println(str.size());
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i).getAttribute("name"));
			takeScreenShot("name");
		}	
	}
	


}
