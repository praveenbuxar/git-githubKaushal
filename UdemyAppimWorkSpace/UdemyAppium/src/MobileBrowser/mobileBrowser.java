package MobileBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mobileBrowser {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("mobilePlatform", "Android");
		cap.setCapability("deviceName", "357a454e7d83");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email address or phone number']")).sendKeys("kaushal.mandal000@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("iamfool");
		driver.findElement(By.xpath("//android.widget.Button[@text='Log In ']")).click();
		

	}

}
