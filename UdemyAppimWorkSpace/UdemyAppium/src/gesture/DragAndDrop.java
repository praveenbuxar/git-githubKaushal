package gesture;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "357a454e7d83");
		cap.setCapability("appPackage", " io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop'] and @index='7'")).click();
		driver.findElement(By.xpath("//*[@content-desc='Drag and Drop']")).click();
		TouchAction t=new TouchAction(driver);
		//t.press(driver.findElement(By.xpath("//android.view.View[@index='1']"))).moveTo(driver.findElement(By.xpath("//android.view.View[@index='5']"))).release().perform();
		t.press(driver.findElement(By.xpath("//*[@index='1']"))).moveTo(driver.findElement(By.xpath("//*[@index='5']"))).release().perform();
	}

}
