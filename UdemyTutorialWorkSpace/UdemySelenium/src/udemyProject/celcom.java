package udemyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class celcom 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.celcom.com.my");
		driver.findElement(By.xpath("//a[contains(text(),'Prepaid')]")).click();
		  driver.navigate().back();
		driver.findElement(By.xpath("(//a[@class='navigation__link'])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='personal/prepaid']")).click();
		driver.navigate().back();
		
		

	}

}
