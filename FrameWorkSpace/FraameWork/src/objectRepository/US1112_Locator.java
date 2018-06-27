package objectRepository;

import org.openqa.selenium.By;

public class US1112_Locator 
{
	public By loginRegister=By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button");
	public By username=By.name("username");
	public By password=By.xpath("password");
	public By userLanguage=By.id("user_language");
	public By salesDistrubtion=By.xpath(".//*[@id='dashborad_menu']/li[2]/a/i");
	public By pickSalesOrder=By.linkText("Pick Sales Order");
	public By pickList=By.linkText("Pick List");
	public By searchIcon=By.xpath(".//*[@id='big_popover']/i");
	public By searchButton=By.id("search_submit_btn");
	public By clickSelect=By.xpath(".//*[@id='tabsLine-0']/table/tbody/tr[2]/td[2]/a");
	public By saveButton=By.xpath(".//*[@id='save']");
	

}
