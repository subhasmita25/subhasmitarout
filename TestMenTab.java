package script;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.SuperScript;
import pom.MenPage;

public class TestMenTab extends SuperScript
{

	@Test
	public void testMen() throws InterruptedException
	{
		
			MenPage m=new MenPage(driver);
			
			m.testMentab();
			System.out.println("Mentab Clicked");
			Actions actions=new Actions(driver);
			actions.sendKeys("w").perform();
			
			driver.get("http://www.shopclues.com/christy-world-solid-mens-jackets-126532313.html");
			//m.testjacket();
			
			log.info("jacket Clicked");
			System.out.println("");
			
			m.lSizeClick();
			log.info("L size clicked");
			
			
			m.addToCartClick();
			log.info("Addto cart clicked");
			
			
			Thread.sleep(2000);
			
			m.cartIconClick();
			log.info("Cart icon clicked");
			
			
			m.placeOrderClick();
			log.info("order clicked");
			
		
	}
}
