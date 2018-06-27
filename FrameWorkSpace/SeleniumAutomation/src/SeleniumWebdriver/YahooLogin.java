package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mg.mail.yahoo.com/");
		driver.findElement(By.name("username")).sendKeys("selenium4u");
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.name("passwd")).sendKeys("selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();

	}

}
