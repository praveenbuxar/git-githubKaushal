package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4Link_Parameter 
{
	public WebDriver driver;
	public void openURL()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/");
		Thread.sleep(2000);
	}
	public void clickCross()throws Exception
	{
		driver.findElement(By.id("closediv")).click();
		Thread.sleep(2000);
		
	}
	public void clickLink(String str)throws Exception
	{
		driver.findElement(By.linkText(str)).click();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Selenium4Link_Parameter s=new Selenium4Link_Parameter();
		s.openURL();
		s.clickLink("Manual FAQs");
		s.clickLink("Selenium FAQs");
		s.clickLink("Core Java FAQs");

	}

}
