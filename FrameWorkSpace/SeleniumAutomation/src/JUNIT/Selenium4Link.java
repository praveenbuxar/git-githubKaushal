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

public class Selenium4Link 
{
	public WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		System.out.println("execution started");

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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/");
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
		Thread.sleep(2000);
	}

	@Test
	public void verifyMFAQS() throws Exception
	{
		driver.findElement(By.linkText("Manual FAQs")).click();
		Thread.sleep(2000);
	}
	@Test
	public void verifysFAQs()throws Exception 
	{
		driver.findElement(By.linkText("Selenium FAQs")).click();
		Thread.sleep(2000);
	}
	@Test
	public void verifyCFAQs()throws Exception
	{
		driver.findElement(By.linkText("Core Java FAQs")).click();
		Thread.sleep(2000);
	}
	

}
