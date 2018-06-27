package objectRepository;

import org.openqa.selenium.By;

public class HMS_PR_Locator 
{
	public By username=By.name("username");
	public By password=By.name("password");
	public By login=By.name("submit");
	public By registration =By.linkText("Registration");
	public By permanentReg=By.linkText("Perminent Registration");
	public By patientCategory=By.name("PATIENT_CAT");
	public By relation=By.name("RELATION");
	public By title=By.name("TITLE");
	public By firstName=By.name("PNT_NAME");
	public By patientIdentifier=By.name("PAT_IDENTITY");
	public By lastName=By.name("LAST_NAME");
	public By idProof=By.name("PAT_IDENTITY_PROOF");
	public By dob=By.name("DOB");
	public By date=By.xpath(".//*[@id='tcalGrid']/tbody/tr[3]/td[5]");
	public By nationality=By.name("NATIONALITY");
	public By age=By.name("AGE");
	public By vip=By.name("IS_MLC");
	public By gender=By.name("SEX");
	public By education=By.name("EDUCATION");
	public By martialStatus=By.name("MTRL_STATUS");
	public By occuption=By.name("OCCUPATION");
	public By relegion=By.name("RELIGION");
	public By bloodgroupcode=By.name("BLOOD_GRP_CODE");
	public By primaryLanguage=By.name("PLANGUAGE");
	public By citizenship=By.name("CITIZENSHIP");
	public By scProof=By.name("SC_PROOF");
	public By address=By.name("ADDRESS1");
	public By phone=By.name("MOBILE_NO");
	public By emailId=By.name("EMAIL_ID");
	public By zip=By.name("ZIP");
	public By country=By.name("COUNTRY_CODE");
	public By image=By.name("image");
	public By saveButton=By.name("submit");


}
