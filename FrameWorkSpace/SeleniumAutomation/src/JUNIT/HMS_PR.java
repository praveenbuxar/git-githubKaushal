package JUNIT;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_PR 
{
	public WebDriver driver;
		// TODO Auto-generated method stub

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("execution started");
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("execution end");
	}

	@Before
	public void setUp() throws Exception 
	{
		driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms/");
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
		Thread.sleep(2000);
	}

	@Test
	public void login() throws Exception
	{
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}
	@Test
	public void registration()
	{
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
		//Thread.sleep(2000);
	}
	@Test
	public void doRegistration()throws Exception
	{
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("jahsdkjs");
		driver.findElement(By.name("PNT_NAME")).sendKeys("kaushal");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("884354657456");
		driver.findElement(By.name("LAST_NAME")).sendKeys("mandal");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath("//table[@id='tcalGrid']/tbody/tr[3]/td")).click();
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("27");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Married");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Formar");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
        driver.findElement(By.name("ADDRESS1")).sendKeys("Tirupathi");
        driver.findElement(By.name("ADDRESS2")).sendKeys("Annamayya Circle");
        driver.findElement(By.name("MOBILE_NO")).sendKeys("1234567890");
        driver.findElement(By.name("EMAIL_ID")).sendKeys("ghatta@gmail.com");
        driver.findElement(By.name("ZIP")).sendKeys("516215");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
        Thread.sleep(2000);
        driver.findElement(By.xpath("html/body/div[4]/table[2]/tbody/tr[3]/td[5]")).click();

		
	}

}
