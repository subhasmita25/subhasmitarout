package generic;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.apache.log4j.Logger;

@Listeners(MyListener.class)
public abstract class SuperScript implements Constants
{
	
	public static Logger log;
	public SuperScript()
	{
		log = Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
//		PropertyConfigurator.configure("Log4j.properties");
	}
	public static WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	@BeforeClass
	public void preCondition()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.shopclues.com/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}

}
