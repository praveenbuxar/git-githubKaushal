package components;

import java.util.Set;

import objectRepository.US1112_Locator;
import utility.BaseClass;
import utility.ReadData;

public class US1112_Method extends BaseClass
{
	US1112_Locator locator=new US1112_Locator();
	public US1112_Method(ReadData readData)
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
	public void loginRegister() throws Exception
	{
		click(locator.loginRegister);
	}
	public void userLogin() throws Exception
	{
		type(locator.username,readData.testDataValue.get("USERNAME"));
		type(locator.password,readData.testDataValue.get("PASSWORD"));
		select(locator.userLanguage, readData.testDataValue.get("UserLanguage"));
	}
	public void salesDistribution() throws Exception
	{
		click(locator.salesDistrubtion);
		click(locator.pickSalesOrder);
		click(locator.pickList);
		click(locator.searchIcon);
		Set<String>window=driver.getWindowHandles();
		System.out.println("popup names are"+window);
		Object[]s=window.toArray();
		driver.switchTo().window(s[1].toString());
		click(locator.searchButton);
		click(locator.clickSelect);
		click(locator.saveButton);
		
		
	}



}
