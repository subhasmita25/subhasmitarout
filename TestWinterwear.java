package script;

import java.util.Set;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.Men_WinterWear;

public class TestWinterwear extends SuperScript
{
	@Test
	public void winterwearValidation() throws InterruptedException
	{
		Men_WinterWear mw=new Men_WinterWear(driver);
		mw.testMentab();
		log.info("men clicked");
	
		
		mw.testWinterwear();
		log.info("Winterwear  clicked");
		
		
		Set<String> w = driver.getWindowHandles();
		System.out.println(w);
		for(String wname:w)
		{
			String expected = "Winter Wear for Men - Buy Winter Clothes for Men Online at Low Prices in India";
			System.out.println(wname);
			driver.switchTo().window(wname);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals(expected))
			{
				mw.clickOnItem();
				log.info("item clicked");
				
			}
			
			
		}
		
		mw.clickOnSize();
		log.info(" M size clicked");
		
		
		mw.clickBuyNow();
		log.info("BuyNow clicked");
		
		
	}

}
