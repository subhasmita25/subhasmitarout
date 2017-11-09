package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men_AllClothingPage 
{

	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	

	@FindBy(xpath="//a[@alt='Home|CT3P1|Men|NA|All Clothing|NA|NA|NA|CT@All Clothing']")
	private WebElement allclothing;
	
	@FindBy(xpath="//a[@href='http://www.shopclues.com/fashion/ayushman-khurana.html']")
	private WebElement brand;
	
	@FindBy(xpath="//img[@id='det_img_95160907']")
	private WebElement imgItem;
	
	@FindBy(xpath="//span[.='L']")
	private WebElement lSize;
	
	@FindBy(xpath="//span[@value='Blue']")
	private WebElement blueClr;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buyNow;
	
	public Men_AllClothingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void testAllClothing() throws InterruptedException
	{
		mentab.click();
		Thread.sleep(2000);
		allclothing.click();
	}
	public void clickBrand()
	{
		brand.click();
	}
	
	public void clickSelectedItem()
	{
		imgItem.click();
	}
	public void clickSize()
	{
	
		lSize.click();
	}
	public void clickColor()
	{
		blueClr.click();
	}
	public void clickBuyNow()
	{
		buyNow.click();
	}
	
}
