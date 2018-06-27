package udemyProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc 
{
	public static WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms");
		
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.close();
	}

	@Test
	public void test() 
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Ignore
	@Test
	public void test1()
	{
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
