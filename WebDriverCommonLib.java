package generic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib 
{
	public void waitForPageToLoad()
	{
		SuperScript.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForElemetPresent(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(SuperScript.driver, 60);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void waitForElementToClick(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(SuperScript.driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	
	public void select(WebElement selwb, String data)
	{
		Select sel = new Select(selwb);
		sel.selectByVisibleText(data);
	}

	public void select(WebElement selwb, int index)
	{
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}
	
	public void action(WebElement target)
	{ 
		
		Actions actions=new Actions(SuperScript.driver);
		actions.moveToElement(target).perform();
		                                          
	}
	
	public void windowHandeling(WebDriver driver)
	{
		Set<String> w = driver.getWindowHandles();
		
	}
}
