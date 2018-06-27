package components;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import objectRepository.PrintAllFieldInInventoryLocator;
import utility.BaseClass;
import utility.ReadData;

public class PrintAllFieldInventoryMethod  extends BaseClass
{
	PrintAllFieldInInventoryLocator locator=new PrintAllFieldInInventoryLocator();
	public PrintAllFieldInventoryMethod(ReadData readData)
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
			openBrowser("chrome");
		openURL(readData.testDataValue.get("AppURL"));
		wait(2000);
		}
		catch(Exception e)
		{
			  log.fatal("Unable to open the URL"+e.getMessage());
		}
	}
	public void userLoginPage() throws Exception
	{
		click(locator.loginRegister);
		wait(2000);
		type(locator.username,readData.testDataValue.get("USERNAME"));
		type(locator.password,readData.testDataValue.get("PASSWORD"));
		select(locator.userLanguage,readData.testDataValue.get("USERLANGUAGE"));
		click(locator.login);
		String str=driver.findElement(By.xpath(".//*[@id='tabsHeader']/div")).getText();
		//System.out.println(str);
		String []s=str.split("\n");
		System.out.println(s.length);
		for(int i=0;i< s.length;i++){
		driver.findElement(By.linkText(s[i])).click();
		Thread.sleep(3000);
	    takeScreenShot(s[i]);
	    Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='header_top_quick_nav']/ul/li[4]/a/i")).click();
		Thread.sleep(4000);
		
		
	}
}
}