package script;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.MobilesPage;

public class TestMobilesTab extends SuperScript
{
	@Test
	public void mobilesValidation() throws InterruptedException
	{
		MobilesPage mb=new MobilesPage(driver);
		mb.testMobile();
		log.info("Mobiles clicked");
		driver.get("http://www.shopclues.com/mobile-phones.html?br[]=Samsung&fsrc=brand");
		
		Thread.sleep(2000);
		
		mb.clickSamsung();
		log.info("Samsungj7 clicked");
		
		Thread.sleep(2000);
		
		mb.clickBuyNow();
		log.info("Buynow clicked");
		
		
		
	}
}
