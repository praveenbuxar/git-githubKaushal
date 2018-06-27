package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Bagdogra (IXB)")).click();
		driver.findElement(By.linkText("Ahmedabad (AMD)")).click();
		driver.findElement(By.linkText("26")).click();
		new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("1 Adult");
		new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("0 Children");
		new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("0 Infant");
		new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"))).selectByVisibleText("Indian Rupee(INR)");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		

	}

}
