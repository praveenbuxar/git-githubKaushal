package UdemyAppimProject;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumBasic {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "7.1.2");
		dc.setCapability("deviceName", "357a454e7d83");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub/"),dc);
		Thread.sleep(10000);
		System.out.println("Yes I am able to open apps");

	}

}
