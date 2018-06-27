package Scroll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireFoxUntrustedCertificate1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("https://cacert.org/");

	}

}
