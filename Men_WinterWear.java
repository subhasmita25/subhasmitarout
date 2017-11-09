package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men_WinterWear 
{
	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	
	@FindBy(xpath="//a[@alt='Home|CT3P2|Men|NA|Winter wear|NA|NA|NA|CT@Winter wear']")
	private WebElement winterWear;
	
	@FindBy(xpath="//img[@id='det_img_100315157']")
	private WebElement imgLink;
	
	@FindBy(xpath="//span[@value='M']")
	private WebElement mSize;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buyNow;
	
	public Men_WinterWear(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void testMentab() throws InterruptedException 
	{
	
		mentab.click();
		
		Thread.sleep(2000);
		
	}

	public void testWinterwear() 
	{
		winterWear.click();
	}
	
	public void clickOnItem() throws InterruptedException 
	{
		imgLink.click();
		Thread.sleep(2000);
	}
	
	public void clickOnSize() throws InterruptedException 
	{
		mSize.click();
		Thread.sleep(2000);
	}
	
	public void clickBuyNow()
	{
		buyNow.click();
	}

}
