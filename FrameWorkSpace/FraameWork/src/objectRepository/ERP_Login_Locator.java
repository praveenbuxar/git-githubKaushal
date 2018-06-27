package objectRepository;

import org.openqa.selenium.By;

public class ERP_Login_Locator 
{
	public By loginRegister=By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button");
	public By username=By.xpath(".//*[@id='username']");
	public By passsword=By.xpath(".//*[@id='password']");
	public By userLanguage=By.xpath(".//*[@id='user_language']");
	public By login=By.xpath(".//*[@id='user_login']/ul/li[4]/input");
	public By admin=By.xpath(".//*[@id='menu1']");
	public By logout=By.xpath(".//*[@id='navbar']/ul/li[6]/div/div/ul/li[8]/a");

}
