package script;

import java.util.Set;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.SportsWear;

public class TestSportsWear extends SuperScript
{
	@Test
	public void sportsWearValidation() throws InterruptedException
	{
		SportsWear sw= new SportsWear(driver);
		sw.testMentab();
		log.info("Mentab clicked");
		System.out.println("");
		
		sw.testSportswear();
		log.info("Sportswear clicked");
		
		Set<String> w = driver.getWindowHandles();
		System.out.println(w);
		for(String wname:w)
		{
			String expected = "Men Sportswear - Buy Sportswear for Men Online at Low Prices in India";
			System.out.println(wname);
			driver.switchTo().window(wname);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals(expected))
			{
				sw.clickOnPuma();
				log.info("Puma clicked");
				
			}
			
			
		}
	
		
		driver.get("http://www.shopclues.com/puma-red-polyester-printed-t-shirt-120426328.html");
		sw.clickOnItem();
		log.info(" item clicked");
		
		
		sw.clickSize();
		log.info("size clicked");
		
		
		sw.clickonBuyNow();
		log.info("buynow clicked");
		
	}

}
