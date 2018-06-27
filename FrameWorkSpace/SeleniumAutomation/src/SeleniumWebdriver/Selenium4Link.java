package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4Link 
{
	public WebDriver driver;
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
		
	}
	public void mFAQs()throws Exception
	{
		driver.findElement(By.linkText("Manual FAQs")).click();
		Thread.sleep(2000);
	}
	public void sFAQs()throws Exception
	{
		driver.findElement(By.linkText("Selenium FAQs")).click();
		Thread.sleep(2000);
	}
	public void cFAQs()throws Exception
	{
		driver.findElement(By.linkText("Core Java FAQs")).click();
		Thread.sleep(2000);
	}
	public void closeSite()throws Exception
	{
		driver.quit();
		Thread.sleep(2000);
	}
public static void main(String[] args) throws Exception
{
	Selenium4Link s= new Selenium4Link();
	s.openURL();
	s.mFAQs();
	s.sFAQs();
	s.cFAQs();
	s.closeSite();
	

}

}
