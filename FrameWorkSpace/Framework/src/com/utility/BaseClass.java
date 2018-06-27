package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver;
	public void openBrowser(String browserName)
	{
		if(browserName.toLowerCase().contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.toLowerCase().contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.t)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
