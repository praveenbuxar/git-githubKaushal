package UdemyAppimProject;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AmazonApp {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "357a454e7d83");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.sso.SigninPromptActivity");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		

	}

}