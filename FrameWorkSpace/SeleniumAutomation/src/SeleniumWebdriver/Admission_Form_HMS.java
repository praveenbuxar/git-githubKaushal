package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Admission_Form_HMS {

	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
		driver.findElement(By.linkText("HMS")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("ADT")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ADT")).sendKeys("cvvkvbafd562145");
		driver.findElement(By.name("MR_NO")).sendKeys("PRjdfhj55");
		driver.findElement(By.name("BOOKING_ID")).sendKeys("kaushal");
		driver.findElement(By.name("REQ_ID")).sendKeys("dshhak");
		new Select(driver.findElement(By.name("ADM_TPYE"))).selectByVisibleText("Accident");
		driver.findElement(By.name("EXP_DATE")).click();
		driver.findElement(By.xpath("html/body/div[4]/table[2]/tbody/tr[3]/td[3]")).click();
		new Select(driver.findElement(By.name("PNT_CLASS"))).selectByVisibleText("1st Class");
		driver.findElement(By.name("EXP_STAY_DATE")).sendKeys("2");
		new Select(driver.findElement(By.name("EXP_STAY_DATE"))).selectByVisibleText("Months");
		new Select(driver.findElement(By.name("INSU_PLAN"))).selectByVisibleText("No");
		driver.findElement(By.name("EXP_DISCHARGE_DATE")).click();
		driver.findElement(By.xpath("html/body/div[4]/table[2]/tbody/tr[3]/td[4]")).click();
		new Select(driver.findElement(By.name("ADM_SOURSE"))).selectByVisibleText("1st Class");
		new Select(driver.findElement(By.name("HOSPITAL_SERVICES"))).selectByVisibleText("Surgery");
		new Select(driver.findElement(By.name("DOC_NAME"))).selectByVisibleText("Sai");
		new Select(driver.findElement(By.name("HOSPITAL_SUB_SERVICES"))).selectByVisibleText("Surgery");
		new Select(driver.findElement(By.name("DOC_SPL"))).selectByVisibleText("Cordialagist");
		driver.findElement(By.name("PROVI_DIAGNOS")).sendKeys("bjksckjds");
		driver.findElement(By.name("PRMRY_CONSULT")).sendKeys("jdfjhjHAJKSD");
		new Select(driver.findElement(By.name("ADD_DOC_SPL"))).selectByVisibleText("Cordialagist");
		new Select(driver.findElement(By.name("ADD_DOC_NAME"))).selectByVisibleText("sharath");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("BED_CLASS"))).selectByVisibleText("A/C");
		new Select(driver.findElement(By.name("ADM_BED_CLASS"))).selectByVisibleText("A/C");
		new Select(driver.findElement(By.name("BED_NUM"))).selectByVisibleText("BED-2");
		new Select(driver.findElement(By.name("NURSING_STATION"))).selectByVisibleText("Jhansi Laxmi");
		new Select(driver.findElement(By.name("WARD_NUM"))).selectByVisibleText("9");
		new Select(driver.findElement(By.name("AMBULATORY_STATUS"))).selectByVisibleText("Ambulance");
		new Select(driver.findElement(By.name("MODE_ARRIVAL"))).selectByVisibleText("With Family Members");
		driver.findElement(By.name("PNT_VALUBLES")).sendKeys("jdsahfjhfsdjajkds");
		new Select(driver.findElement(By.name("CAPTURED_BY"))).selectByVisibleText("Doctor");
		driver.findElement(By.name("CAPTURED_DATE")).click();
		driver.findElement(By.xpath("html/body/div[4]/table[2]/tbody/tr[4]/td[5]")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
