package JUNIT;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMS_PR1 
{
	public WebDriver driver;


	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/hms/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void test1() 
	{
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
	}
	@Test
	public void test2()
	{   
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
	}

}
