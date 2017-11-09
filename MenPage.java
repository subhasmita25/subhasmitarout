package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage  
{
	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	
	@FindBy(xpath="//a[.='Jackets']")
	private WebElement jacektlink;
	
	@FindBy(xpath="//span[.='L']")
	private WebElement lSize;
	
	@FindBy(xpath="//button[@id='add_cart']")
	private WebElement addtoCartBtn;
	
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//div[.='Place Order']")
	private WebElement placeodr;
	
	
	public MenPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void testMentab() throws InterruptedException 
	{
	
		mentab.click();
		jacektlink.click();
		Thread.sleep(2000);
	}
	
	public void lSizeClick()
	{
		lSize.click();
		
	}
	public void addToCartClick()
	{
		addtoCartBtn.click();
		
	}
	public void cartIconClick()
	{
		cartIcon.click();
		
	}
	public void placeOrderClick()
	{
		placeodr.click();
		
	}

}
