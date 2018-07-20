package UdemyAppimProject;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class clicking {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "357a454e7d83");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		AndroidDriver<AndroidElement>driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();

	}

}
