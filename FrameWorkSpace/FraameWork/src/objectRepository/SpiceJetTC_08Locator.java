package objectRepository;

import org.openqa.selenium.By;

public class SpiceJetTC_08Locator 
{
	public By oneWay=By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']");
	public By from=By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
	public By origin=By.linkText("Agartala (IXA)");
	public By destination=By.linkText("Delhi (DEL)");
	public By date=By.linkText("17");
	public By adult=By.id("ctl00_mainContent_ddl_Adult");
	public By currency=By.id("ctl00_mainContent_DropDownListCurrency");
	public By findFlight=By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']");
	

}
