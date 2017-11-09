package script;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.Notification;

public class NotificationTest extends SuperScript
{
	@Test
	public void NotificationValidation()
	{
		Notification n=new Notification(driver);
		n.clickOnNotification();
		log.info("Notification Clicked");
		
	}

}
