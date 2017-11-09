package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverCommonLib;

public class MenAllEyeWearPage extends WebDriverCommonLib
{
	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	
	@FindBy(xpath="//a[.='All Eyewear']")
	private WebElement eyewear;
	
	@FindBy(xpath="(//a[.='Cat Eyes'])[1]")
	private WebElement cateyes;
	

	@FindBy(xpath="//a[@href='http://www.shopclues.com/626mg1772voyage-unisex-sunglasses-123382744.html']")
	private WebElement imgClick;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buynow;
	
	public MenAllEyeWearPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void testMentab() 
	{
		mentab.click();
		
	}
	public void testMenEyeWear()
	{
		action(eyewear);
		eyewear.click();
		
	}
	public void testCatEyes() 
	{
		cateyes.click();
		
	}
	public void clickOnItem() 
	{
		imgClick.click();
		
	}
	public void clickBuyNow()
	{
		buynow.click();
	}
	
}
