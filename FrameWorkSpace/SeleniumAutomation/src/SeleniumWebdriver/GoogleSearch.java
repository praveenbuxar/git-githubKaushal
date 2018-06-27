package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium4testing.com");
		driver.findElement(By.name("btnK")).click();

	}

}
