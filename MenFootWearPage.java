package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverCommonLib;

public class MenFootWearPage extends WebDriverCommonLib
{
	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	
	@FindBy(xpath="//a[.='All Footwear']")
	private WebElement allfootwear;
	
	@FindBy(xpath="//img[@alt='DK Shoes Canvas Casual Shoes']")
	private WebElement casualftwear;
	
	@FindBy(xpath="//span[@tooltip='Yellow']")
	private WebElement yellow;
	

	@FindBy(xpath="//span[@value='7']")
	private WebElement ftSize;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buynow;

	public MenFootWearPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void testMentab() 
	{
	
		mentab.click();
		
	}
	
	public void testMenFootWear()
	{
		action(allfootwear);
		allfootwear.click();
		
	}
	
	public void testCasualFootwear()
	{
		casualftwear.click();
	}
	
	public void testColor()
	{
	
		yellow.click();
	}
	public void testSize()
	{
	
		ftSize.click();
	}
	public void clickBuyNow()
	{
		buynow.click();
	}
}
