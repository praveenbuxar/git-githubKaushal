package components;

import objectRepository.CreateAccountERP_Locator;
import utility.BaseClass;
import utility.ReadData;

public class CreateAccountERPMethod extends BaseClass
{
	CreateAccountERP_Locator locator=new CreateAccountERP_Locator();
	public CreateAccountERPMethod(ReadData readData)
	{
		this.readData=readData;
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
	public void loginRegister() throws Exception
	{
		click(locator.loginRegister);
	}
	public void newAccount() throws Exception
	{
		click(locator.newAccount);
		type(locator.firstName,readData.testDataValue.get("FIRSTNAME"));
		type(locator.lastName,readData.testDataValue.get("LASTNAME"));
		type(locator.userName,readData.testDataValue.get("USERNAME"));
		type(locator.emailId,readData.testDataValue.get("EMAILID"));
		type(locator.enterPassword,readData.testDataValue.get("PASSWORD"));
		type(locator.confirmPassword,readData.testDataValue.get("CONFIRMPASSWORD"));
		type(locator.phone,readData.testDataValue.get("PHONE"));
		click(locator.createAccount);
		
	}
	
}
