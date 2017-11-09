package script;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.Men_AllClothingPage;

public class TestAllClothing_Men extends SuperScript
{
	@Test
	public void testMen() throws InterruptedException 
	{
		Men_AllClothingPage menAll=new Men_AllClothingPage(driver);
		
		menAll.testAllClothing();
		log.info("AllClothing clicked");
		
		
		menAll.clickBrand();
		log.info("Brand clicked");
		
		driver.get("href='http://www.shopclues.com/fashion/ayushman-khurana.html");
		Thread.sleep(2000);
		
		menAll.clickSelectedItem();
		log.info("Item clicked");
		
		
		menAll.clickSize();
		log.info("Size clicked");
		
		
		menAll.clickColor();
		log.info("Color clicked");
		
		
		menAll.clickBuyNow();
		log.info("Buynow clicked");
		
	}

}
