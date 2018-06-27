package components;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import objectRepository.SpiceJetTestCase2Locator;
import utility.BaseClass;
import utility.ReadData;

public class SpiceJetTestCase2Method  extends BaseClass
{
	SpiceJetTestCase2Locator locator=new SpiceJetTestCase2Locator();
	public SpiceJetTestCase2Method(ReadData readData)
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
		String str=driver.findElement(By.xpath(".//*[@id='home_banner']/a/img")).getText();
		String []s=str.split("\n");
		System.out.println(s.length);
		for(int i=0;i< s.length;i++){
		driver.findElement(By.linkText(s[i])).click();
		Thread.sleep(3000);
	    takeScreenShot(s[i]);
	    Thread.sleep(5000);
		
	}
	}
	

}
