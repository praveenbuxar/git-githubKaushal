package objectRepository;

import org.openqa.selenium.By;

public class CreateAccountERP_Locator 
{
	public By loginRegister=By.xpath(".//*[@id='topbar']/div/div/div[3]/div[1]/div/button");
	public By newAccount=By.xpath(".//*[@id='ui-id-2']");
	public By firstName=By.xpath(".//*[@id='user_header']/ul/li[1]/input");
	public By lastName=By.xpath(".//*[@id='user_header']/ul/li[2]/input");
	public By userName=By.xpath(".//*[@id='user_header']/ul/li[3]/input");
	public By emailId=By.xpath(".//*[@id='user_header']/ul/li[4]/input");
	public By enterPassword=By.xpath(".//*[@id='enteredPassword']");
	public By confirmPassword=By.xpath(".//*[@id='enteredRePassword']");
	public By phone=By.xpath(".//*[@id='user_header']/ul/li[7]/input");
	public By createAccount=By.xpath(".//*[@id='user_header']/input");
	

}
