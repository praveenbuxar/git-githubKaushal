package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HmsSearch_BusinessFunction extends utility.BaseClass {

	WebDriver driver;
	public objectRepository.Hms_Locators HmsLocators=new objectRepository.Hms_Locators(driver);
	public utility.ReadData pdfResultReport=new utility.ReadData();
	
	public HmsSearch_BusinessFunction(utility.ReadData pdfresultReport)
	{
		this.pdfResultReport=pdfresultReport;
	}
	
	public void launchApp() throws Exception{
		try{
			log.info("Execution Started......................");	
			openURL(pdfResultReport.testDataValue.get("AppURL"));
		log.info("Opened the URL::::::::::::"+pdfResultReport.testDataValue.get("AppURL"));
		pdfResultReport.addStepDetails("Open the URL","Application should open the url","Successfully opened the URL" + " ","Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("openURL method ","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }
	}
	public void login() throws Exception{
		try{
			
			waitForElement(HmsLocators.Username, 10);
		type(HmsLocators.Username,pdfResultReport.testDataValue.get("Username") );
		log.info("Entered username");
		
		waitForElement(HmsLocators.password, 10);

		type(HmsLocators.password, pdfResultReport.testDataValue.get("Password"));
		log.info("Entered Password");
		click(HmsLocators.Login);
		log.info("Clicked on Login");	
		
		pdfResultReport.addStepDetails("login ","HMS should login into the application","Logged in into the applciation" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to login into the application"+e.getMessage());
			  pdfResultReport.addStepDetails("login ","HMS should login into the application", "Unable to login into the application :"+e.getMessage(), "Fail", "N");
		  }
	}
	
	public void Permanent_Registration() throws Exception{
		try{
			
			click(HmsLocators.Registration);
			log.info("clickied on Registration ");
			
			select(HmsLocators.Patient_catatgort, "Insurance");
			log.info("selected Insurance");
			
			select(HmsLocators.Relation, "Brother");
			log.info("selected Brother");
			
			select(HmsLocators.Title, "Mr.");
			log.info("selected Mr.");
			
			type(HmsLocators.First_Name, "Raman");
			log.info("typed first name as ram");
			
			select(HmsLocators.Patient_Identifier, "PAN Card");
			log.info("selected PAN Card");
			
			type(HmsLocators.Pan_no, "Bjp12345b");
			log.info("typed first pan no  as Bjp12345b");
			
			type(HmsLocators.Last_name, "sharma");
			log.info("typed last name  as sharma");
			
			click(HmsLocators.DOB);
			log.info("clickied on DOB ");
			
			waitForElement(HmsLocators.date, 20);
			
			click(HmsLocators.date);
			log.info("clickied on Date ");
			
			select(HmsLocators.Nationality, "Indian");
			log.info("selected Indian");
			
			type(HmsLocators.Age, "23");
			log.info("typed Age  as 23");
			
			select(HmsLocators.Vip, "No");
			log.info("selected No");
			
			select(HmsLocators.Gender, "Male");
			log.info("selected Male");
			
			select(HmsLocators.Education, "B.Tech");
			log.info("selected B.Tech");
			
			select(HmsLocators.Marital_Status, "Single");
			log.info("selected Single");
			
			select(HmsLocators.Occupation, "Employee");
			log.info("selected Employee");
			
			select(HmsLocators.Religion, "Hindu");
			log.info("selected Hindu");
			
			select(HmsLocators.Bloodgrp, "A+");
			log.info("selected A+");
			
			select(HmsLocators.PrimaryLanguage, "Hindi");
			log.info("selected Hindi");
			
			select(HmsLocators.Citizenship, "Indian");
			log.info("selected Indian");
			
			select(HmsLocators.SeniorCitizenProof, "No");
			log.info("selected No");
			
			type(HmsLocators.Address1, "Hyderabad");
			log.info("typed Address as hyderabad");
			
			type(HmsLocators.Phone, "9988774455");
			log.info("typed phone  as 9988774455");
			
			select(HmsLocators.Country_code, "India");
			log.info("selected India");
			
			type(HmsLocators.Pin_Zip, "493196");
			log.info("typed pin no as 493196");
			
			
			click(HmsLocators.Submit);
			log.info("clickied on submit ");
			
		pdfResultReport.addStepDetails("Permanent Registration  ","Permanent Registration  should be done","Conformation shoud get" ,"Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to get the conformation of permanent registration"+e.getMessage());
			  pdfResultReport.addStepDetails("Permanent Registration ","Permanent Registration is not done", "Invalid credential :"+e.getMessage(), "Fail", "N");
		  }
    }
}
