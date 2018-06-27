package SIKULIAPP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class UploadFile
{
	public WebDriver driver;
	Screen s=new Screen();

  @Test
  public void test_01() throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys("user1");
	  driver.findElement(By.name("password")).sendKeys("user1");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.linkText("Perminent Registration")).click();
	  Thread.sleep(5000);
  }
  @Test
  public void test_02() throws Exception
  {
	 s.click("D:\\library\\SIKULI_IMAGE.sikuli\\browsebutton.png");
	 s.click("D:\\library\\SIKULI_IMAGE.sikuli\\thispc.png");
	 s.type("D:\\library\\SIKULI_IMAGE.sikuli\\filename.png","D:\\library\\kaushal.png");
	 s.click("D:\\library\\SIKULI_IMAGE.sikuli\\openbutton.png");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://localhost/hms");
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
