package ERP_TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HMSEmergencyREG 
{
	public WebDriver driver;
  @Test
  public void test_01() throws Exception 
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
  }
  @Test
  public void test_02() throws Exception
  {
  
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Emergency Registration")).click();
	  Thread.sleep(2000);
	  new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Pay Patient");
	  new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
	  new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	  driver.findElement(By.name("PNT_NAME")).sendKeys("kaushal");
	  new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
	  driver.findElement(By.name("LAST_NAME")).sendKeys("mandal");
	  driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("shcjdh568");
	  driver.findElement(By.name("DOB")).click();
	  driver.findElement(By.xpath(".//*[@id='tcalGrid']/tbody/tr[3]/td[4]")).click();
	  new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
	  driver.findElement(By.name("AGE")).sendKeys("27");
	  new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
	  new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	  new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
	  new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
	  new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
	  new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
	  new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
	  new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Hindi");
	  new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
	  new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
	  driver.findElement(By.name("ADDRESS1")).sendKeys("digwadih new colony no-10");
	  driver.findElement(By.name("MOBILE_NO")).sendKeys("9470527246");
	  driver.findElement(By.name("EMAIL_ID")).sendKeys("kaushal.mandal000@gmail.com");
	  driver.findElement(By.name("ZIP")).sendKeys("828110");
	  new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
	  driver.findElement(By.name("image")).sendKeys("D:\\library\\kaushal.png");
	  driver.findElement(By.xpath(".//*[@id='form1']/div[1]/table/tbody/tr[18]/td[2]/input")).click();
	  Thread.sleep(2000);
  }
  @Test
  public void test_03() throws Exception
  {
	  String str;
	  str=driver.switchTo().alert().getText();
	  System.out.println(str);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
  }
  @Test
  public void test_04()throws Exception
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='navigation']/li[1]/ul/li[3]/a")).click();
	  
	  
  }
 

  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/hms");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
