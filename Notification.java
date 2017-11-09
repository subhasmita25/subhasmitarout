package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification 
{
	@FindBy(xpath="//a[@class='notify_ic']")
	private WebElement notifybtn;

	public Notification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNotification()
	{
		notifybtn.click();
	}
}
