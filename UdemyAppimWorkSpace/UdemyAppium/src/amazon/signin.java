package amazon;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class signin {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "357a454e7d83");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sso_continue")).click();
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Your Account']")).click();
		List<WebElement>links=driver.findElements(By.className("android.widget.TextView"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}

	}

}