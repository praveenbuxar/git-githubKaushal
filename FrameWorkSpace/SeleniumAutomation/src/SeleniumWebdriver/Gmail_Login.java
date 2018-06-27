package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("Email")).sendKeys("kaushal.mandal000@gmail.com");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("kaushal123");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);

	}

}
