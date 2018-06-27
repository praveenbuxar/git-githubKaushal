package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_PR {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/hms/");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("bindu devi");
		driver.findElement(By.name("PNT_NAME")).sendKeys("kaushal");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("kumar");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("hishdjhsdjkhf");
		driver.findElement(By.name("LAST_NAME")).sendKeys("mandal");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath(".//*[@id='tcalGrid']/tbody/tr[3]/td[4]"));
		new Select(driver.findElement(By.linkText("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("27");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Hindi");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("ADDRESS1")).sendKeys("hjkhcjkdsckjhdsj");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("94705272461");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("kaushal.mandal000@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ADDRESS2")).sendKeys("dckjjdscdhjkjd");
		driver.findElement(By.name("ZIP")).sendKeys("828110");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\kaushalmandal\\Desktop");
		driver.findElement(By.name("Clear")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

	}

}
