package objectRepository;

import org.openqa.selenium.By;

public class CreateItemMaster_Locator 
{
	public By loginRegister=By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button");
	public By username=By.id("username");
	public By password=By.id("password");
	public By userLanguage=By.id("user_language");
	public By login=By.name("submitLogin");
	public By inventory=By.linkText("Inventory");
	public By itemMaster=By.xpath(".//*[@id='path_by_module']/div/div[2]/ul[1]/li[1]/a");
	public By itemId=By.xpath("html/body/div[3]/div[3]/div[1]/div/form/div[1]/div/div/div[1]/ul/li[2]/input");
	public By searchIcon=By.xpath(".//*[@id='tabsHeader-1']/ul/li[2]/i");
	public By searchButton=By.id("search_submit_btn");
	public By clickSelect=By.linkText("10198");
	public By orgId=By.id("org_id");
	public By itemType=By.xpath(".//*[@id='item_type']");
	public By uomId=By.id("uom_id");
	public By itemStatus=By.id("item_status");
	public By manufacturing=By.linkText("Manufacturing");
	public By makeBuy=By.id("make_buy");
	public By saveButton=By.xpath(".//*[@id='save']");

}
