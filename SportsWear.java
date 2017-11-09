package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsWear 
{

	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	
	@FindBy(xpath="//a[@alt='Home|CT3P6|Men|NA|Sportswear|NA|NA|NA|CT@Sportswear']")
	private WebElement sportsweartab;
	
	
	@FindBy(xpath="///a[@href='https://www.shopclues.com/mens-sports-wear.html?br[]=Puma&df[]=21.00-40.00&df[]=41.00-60.00&fsrc=discount_percentage,brand&bs=1&bs=2']")
	private WebElement puma;
	
	@FindBy(xpath="//img[@alt='Puma Red Polyester Printed T-shirt']")
	private WebElement imgLink;
	
	@FindBy(xpath="//span[@value='S']")
	private WebElement sSize;
	
	@FindBy(xpath="//button[@id='buy']")
	private WebElement buyNow;
	
	public SportsWear(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void testMentab() throws InterruptedException 
	{
	
		mentab.click();
		Thread.sleep(2000);
		
	}
	
	public void testSportswear() throws InterruptedException 
	{
		sportsweartab.click();
		
		Thread.sleep(2000);
	}
	
	public void clickOnPuma() throws InterruptedException 
	{
		puma.click();
		
		Thread.sleep(2000);
	}
	public void clickOnItem() throws InterruptedException 
	{
		imgLink.click();
		Thread.sleep(2000);
	}
	public void clickSize() throws InterruptedException 
	{
		sSize.click();
		Thread.sleep(2000);
	}
	
	public void clickonBuyNow()
	{
		buyNow.click();
	}
	

}
