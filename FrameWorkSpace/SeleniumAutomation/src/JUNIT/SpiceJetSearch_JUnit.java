package JUNIT;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetSearch_JUnit 
{
	public WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		System.out.println("execution started");
		Thread.sleep(2000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("execution end:");
	}

	@Before
	public void setUp() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com/");
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
		Thread.sleep(2000);
	}

	@Test
	public void verifySearch()throws Exception 
	{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Jammu (IXJ)")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("1 Adult");
		new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("0 Children");
		new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("0 Infant");
		new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
				
		
	}

}
