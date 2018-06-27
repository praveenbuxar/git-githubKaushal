package components;

import objectRepository.HMSEmergencyLocator;
import utility.BaseClass;
import utility.ReadData;

public class HMSEmergencyMethod  extends BaseClass
{
	HMSEmergencyLocator locator=new HMSEmergencyLocator();
	public HMSEmergencyMethod(ReadData readData)
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
	public void userLoginPage() throws Exception
	{
		type(locator.username,readData.testDataValue.get("USERNAME"));
		type(locator.password,readData.testDataValue.get("PASSWORD"));
		click(locator.login);
		wait(2000);
	}
	public void links() throws Exception
	{
		click(locator.registration);
		wait(2000);
		click(locator.emergencyRegistration);
		wait(2000);
	}
	public void emergencyRegPage() throws Exception
	{
		select(locator.patientCategory,readData.testDataValue.get("PATIENTCATEGORY"));
		select(locator.relation, readData.testDataValue.get("RELATION"));
		select(locator.title, readData.testDataValue.get("TITLE"));
		type(locator.firstName,readData.testDataValue.get("FIRSTNAME"));
		select(locator.patientIdentifier, readData.testDataValue.get("PATIENTIDENTIFIER"));
		type(locator.lastName,readData.testDataValue.get("LASTNAME"));
		type(locator.idProof,readData.testDataValue.get("IDCARD"));
		click(locator.dob);
		click(locator.date);
		select(locator.nationality, readData.testDataValue.get("NATIONALITY"));
		type(locator.age,readData.testDataValue.get("AGE"));
		select(locator.vip, readData.testDataValue.get("VIP"));
		select(locator.gender,readData.testDataValue.get("GENDER"));
		select(locator.education, readData.testDataValue.get("EDUCATION"));
		select(locator.martialStatus, readData.testDataValue.get("MARTIALSTATUS"));
		select(locator.occuption, readData.testDataValue.get("OCCUPTION"));
		select(locator.relegion, readData.testDataValue.get("RELEGION"));
		select(locator.bloodgroupcode,readData.testDataValue.get("BLOODGROUP"));
		select(locator.primaryLanguage, readData.testDataValue.get("PRIMARYLANGUAGE"));
		select(locator.citizenship, readData.testDataValue.get("CITIZENSHIP"));
		select(locator.scProof, readData.testDataValue.get("SCPROOF"));
		type(locator.address,readData.testDataValue.get("ADDRESS"));
		type(locator.phone,readData.testDataValue.get("PHONE"));
		type(locator.emailId,readData.testDataValue.get("EMAILID"));
		select(locator.country, readData.testDataValue.get("COUNTRY"));
		type(locator.image,readData.testDataValue.get("IMAGE"));
		click(locator.saveButton);
		
	}

}
