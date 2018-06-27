package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[@text()='Automation Tools']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int total_size=links.size();
		for(int i=0;i<total_size;i++)
		{
			WebElement element=links.get(i);
			String text=element.getAttribute("innerHTML");
			boolean status=element.isEnabled();
			System.out.println("links name is"+text+"and the links status is"+status);
			if(text.equalsIgnoreCase("Appium"))
			{
				element.click();
				break;
			}
		}
		
	}

}
