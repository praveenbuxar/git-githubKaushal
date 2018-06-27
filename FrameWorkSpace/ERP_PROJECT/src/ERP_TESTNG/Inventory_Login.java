package ERP_TESTNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Inventory_Login 
{
	public WebDriver driver;
  @Test
 public void click(String loc)
 {
	  driver.findElement(By.xpath(loc)).click();
 }
  public void enterText(String loc,String value)
  {
	  driver.findElement(By.xpath(loc)).sendKeys(value);
  }
  public void select(String loc,String value)
  {
	  driver.findElement(By.xpath(loc)).sendKeys(value);
  }
  public void waitTime(int time)throws Exception
  {
	 Thread.sleep(2000); 
  }
	
  @Test
  public void f() throws Exception
  {
	  //login into ERP
	  
	  click(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button");
	  enterText(".//*[@id='username']","admin");
	  enterText(".//*[@id='password']","admin");
	  select(".//*[@id='user_language']","English");
	  click(".//*[@id='user_login']/ul/li[4]/input");
	  
	  //click on Inventory module
	  
	  click(".//*[@id='dashborad_menu']/li[1]/a/i");
	  waitTime(3000);
	  
	  //click on ItemMaster tab
	  
	  click(".//*[@id='path_by_module']/div/div[2]/ul[1]/li[1]/a");
	  waitTime(2000);
	  String str=driver.getWindowHandle();
	  System.out.println("the main window name"+str);
	  click(".//*[@id='item_id']");
	  click(".//*[@id='tabsLine-1']/div[1]/ul/li[2]/label");
	  
	  //to Handle the windows
	  
	  Set<String> wname=driver.getWindowHandles();
	  Object o[]=wname.toArray();
	  
	  //Navigating to child window
	  
	  driver.switchTo().window(o[1].toString());
	  
	  //select value from the child window
	  
	  click(".//*[@id='search_submit_btn']");
	  
	  click(".//*[@id='tabsLine-0']/table/tbody/tr[1]/td[2]/a");
	  
	  select(".//*[@id='org_id']","MAS");
	  
	  select(".//*[@id='product_line']","Mobile X 7 Series");
	  
	  select(".//*[@id='item_type']","Equipment");
	  
	  select(".//*[@id='uom_id']","HR");
	  
	  select(".//*[@id='item_status']","Active");
	  
	  //Click on Manufacturing tab and select the Value in the MakeBuy
	  
	  click(".//*[@id='ui-id-35']");
	  
	  select(".//*[@id='make_buy']","BUY");
	  
	  select(".//*[@id='wip_supply_type']","Bulk");
	  
	  select(".//*[@id='bom_type']","Model");
	  
	  //click on save button
	  
	  click(".//*[@id='save']");
	  
	  //get the text from the left side tab
	  
	  String data=driver.findElement(By.xpath(".//*[@id='json_save_header']/div")).getText();
	  System.out.println(data);
	  String[]value=data.split("\n");
	  System.out.println("length of the value"+value.length);
	  for(int i=0;i<value.length;i++)
	  {
		  if(value[i].contains("10"))
		  {
			  System.out.println(value[i]);
		  }
	  }
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://localhost/erp/");
  }

  @AfterTest
  public void afterTest() {
  }

}
