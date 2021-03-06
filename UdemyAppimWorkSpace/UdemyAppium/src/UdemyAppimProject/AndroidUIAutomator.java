package UdemyAppimProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidUIAutomator {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "357a454e7d83");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		List<WebElement>ele=driver.findElementsByAndroidUIAutomator("new uiSelector().clickable('true')");
		System.out.println(ele.size());
		
		

	}

}
