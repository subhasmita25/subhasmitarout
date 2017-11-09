package script;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.MenFootWearPage;

public class TestFootWear extends SuperScript
{
	@Test
	public void footwearValidation() throws Exception
	{
		MenFootWearPage fw= new MenFootWearPage(driver);
		fw.testMentab();
		log.info("Men tab clicked");
		
		fw.testMenFootWear();
		log.info("Footwear clicked");
		
		driver.get("http://www.shopclues.com/footwear-mens-casual-shoes.html");
		log.info("Casual Shoes clicked");
		
		fw.testCasualFootwear();
		log.info("DK Shoes Canvas Casual Shoes clicked");
		fw.testColor();
		log.info("Color clicked");
		fw.testSize();
		log.info("Size clicked");
		fw.clickBuyNow();
		log.info("Buy now clicked");
	}

}
