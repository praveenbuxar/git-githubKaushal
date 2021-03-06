package gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class tapAndLongPress {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "357a454e7d83");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://127.0.01:4723/wd/hub"),cap);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		TouchAction t=new TouchAction(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists' and @index='8']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter' and @index='0']")).click();
		//t.longPress(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names' and @index='0']"))).waitAction(Duration.ofMillis(3000)).release().perform();
		//t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names' and @index='0'])"))).waitAction(Duration.ofMillis(3000)).release().perform();
		t.longPress(longPressOptions().withElement(((Object) By.xpath("//android.widget.TextView[@text='People Names' and @index='0'])")).withDuration(Duration.ofMillis(3000))).release().perform();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		

	}

}
