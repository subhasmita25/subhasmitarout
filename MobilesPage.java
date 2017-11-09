package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage 
{
	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//img[@title='Samsung J7 Max (4 GB, 32 GB, Gold)']")
	private WebElement samsung;
	
	@FindBy(xpath="//button[.='Buy Now']")
	private WebElement buynow;

	public MobilesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void testMobile()
	{
		mobiles.click();
		
		
	}
	
	public void clickSamsung()
	{
		samsung.click();
	}
	
	public void clickBuyNow()
	{
		buynow.click();
	}
	
	
}
