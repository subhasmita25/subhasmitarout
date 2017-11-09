package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeKitchenPage 
{
	@FindBy(xpath="//a[.='Home & Kitchen']")
	private WebElement home_kitchen_tab;
	
	@FindBy(xpath="/(//a[.='Kitchen Tools'])[1]")
	private WebElement kitchentools;
	
	@FindBy(xpath="//img[@title='Plastic Finger Potato Chips Cutter French Fries']")
	private WebElement imglink;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buynow;
	
	public HomeKitchenPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homekitchenTabClick()
	{
		home_kitchen_tab.click();
	}
	
	public void kitchenToolsClick()
	{
		kitchentools.click();
	}
	
	public void imagelinkClick()
	{
		imglink.click();
	}
	public void clickBuyNow()
	{
		buynow.click();
	}

}
