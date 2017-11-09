package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	private WebElement searchbox;
	
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchbtn;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterDataForSearch(String input)
	{
		searchbox.sendKeys(input);
	}
	public void clickOnSearch()
	{
		searchbtn.click();
	}

}
