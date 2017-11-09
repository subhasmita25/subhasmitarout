package script;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import generic.SuperScript;
import pom.MenAllEyeWearPage;

public class TestMenEyeWear extends SuperScript
{
	@Test
	public void eyewearValidation() throws Exception
	{
		MenAllEyeWearPage ew=new MenAllEyeWearPage(driver);
		ew.testMentab();
		log.info("menTab clicked");
		ew.testMenEyeWear();
		
		Thread.sleep(2000);
		ew.testCatEyes();
		log.info("Cat eyes clicked");
		ew.clickOnItem();
		log.info("Item clicked");
		ew.clickBuyNow();
		log.info("Buy now clicked");
	}

}
