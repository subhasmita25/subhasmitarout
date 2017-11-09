package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverCommonLib;

public class WomenPage extends WebDriverCommonLib 
{
	@FindBy(xpath="//a[.='Women']")
	private WebElement womentab;
	
	@FindBy(xpath="//img[@title='Indian Beauty Multicolor Self Design Art Silk Saree With Blouse']")
	private WebElement design;
	
	@FindBy(xpath="///span[@value='Blue']")
	private WebElement clrtab;
	
	@FindBy(xpath="//button[@id='add_cart']")
	private WebElement addtoCartBtn;
	
	public WomenPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void testWomentab() throws InterruptedException 
	{
	
		womentab.click();
		
		
		
	}
	public void selectDesign()
	{
		action(design);
		design.click();
	}
	public void orderSaree() throws InterruptedException
	{
		action(clrtab);
		clrtab.click();
		action(addtoCartBtn);
		addtoCartBtn.click();
		
	}
	
	
	

}
