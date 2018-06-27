package components;

import objectRepository.ERP_Login_Locator;
import utility.BaseClass;
import utility.ReadData;

public class ERP_Login_method extends BaseClass
{
	ERP_Login_Locator locator=new ERP_Login_Locator();
	
	public ERP_Login_method(ReadData readData)
	{
		this.readData=readData;
	}
	
	
	public void launchApp() throws Exception{
		try{
			openBrowser("firefox");
		openURL(readData.testDataValue.get("AppURL"));
		//readData.addStepDetails("openURL","Application should open the url","Successfully opened the URL" + " ","Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  //readData.addStepDetails("openURL method ","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }}
	
	
		public void login() throws Exception
		{
			click(locator.loginRegister);
			waitForElement(locator.loginRegister, 2000);
			type(locator.username,readData.testDataValue.get("USERNAME"));
			type(locator.passsword,readData.testDataValue.get("PASSWORD"));
			select(locator.userLanguage,"English");
			click(locator.login);
			
		}
		
		
		public void logout()throws Exception
		{
			click(locator.admin);
			waitForElement(locator.admin, 2000);
			click(locator.logout);
		}

}
