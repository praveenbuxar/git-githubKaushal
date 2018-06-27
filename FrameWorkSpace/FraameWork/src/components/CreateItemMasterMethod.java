package components;

import objectRepository.CreateItemMaster_Locator;
import utility.BaseClass;
import utility.ReadData;

public class CreateItemMasterMethod  extends BaseClass
{
	CreateItemMaster_Locator locator=new CreateItemMaster_Locator();
	public CreateItemMasterMethod(ReadData readData)
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
	public void userLoginPage() throws Exception
	{
		click(locator.loginRegister);
		wait(2000);
		type(locator.username,readData.testDataValue.get("USERNAME"));
		type(locator.password,readData.testDataValue.get("PASSWORD"));
		select(locator.userLanguage,readData.testDataValue.get("USERLANGUAGE"));
		click(locator.login);
		wait(2000);
		
	}
	public void userDashBoard() throws Exception
	{
		click(locator.inventory);
		wait(2000);
		click(locator.itemMaster);
		wait(2000);
		click(locator.itemId);
		wait(2000);
		click(locator.searchIcon);
		switchwindow(1);
		click(locator.searchButton);
		click(locator.clickSelect);
		switchwindow(0);
		select(locator.orgId, readData.testDataValue.get("ORGID"));
		
		
	}
	public void itemDetails() throws Exception
	{
		select(locator.itemType,readData.testDataValue.get("ITEMTYPE"));
		wait(2000);
		select(locator.uomId,readData.testDataValue.get("UOMID"));
		wait(2000);
		select(locator.itemStatus, readData.testDataValue.get("ITEMSTATUS"));
		wait(2000);
		click(locator.manufacturing);
		wait(2000);
		select(locator.makeBuy, readData.testDataValue.get("MAKEBUY"));
		
	}
	public void save() throws Exception
	{
		click(locator.saveButton);
	}

}
