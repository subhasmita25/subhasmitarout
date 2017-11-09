package script;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.WomenPage;

public class TestWomenTab extends SuperScript
{
	
	@Test
	public void testWomen() throws InterruptedException
	{
		WomenPage w=new WomenPage(driver);
		w.testWomentab();
		log.info("Women tab clicked");
		
		Thread.sleep(2000);
		driver.get("http://www.shopclues.com/womens-clothing-ethnic-wear-sarees.html");
		log.info("Saree clicked");
	
		
		w.selectDesign();
		log.info("saree design clicked");
		
		w.orderSaree();
		log.info("saree oder placed");
		
		
	}
}
