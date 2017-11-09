package script;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import generic.SuperScript;
import pom.HomeKitchenPage;

public class HomeKitchenTest extends SuperScript
{
	
	@Test
	public void homekitchenValidation() throws InterruptedException
	{
		
		
		HomeKitchenPage hk=new HomeKitchenPage(driver);
		hk.homekitchenTabClick();
		
		
		Thread.sleep(2000);
		
		//hk.kitchenToolsClick();
		
		driver.get("http://www.shopclues.com/kitchen-dining-tools.html?sort_by=bestsellers&sort_order=desc");
		//System.out.println("");
		log.info("Kitchen tools link opened");
		
		hk.imagelinkClick();
		log.info("Image link clicked");
		
		Thread.sleep(2000);
		
		hk.clickBuyNow();
		log.info("Buy now clicked");
		
	}
	
	
	

}
