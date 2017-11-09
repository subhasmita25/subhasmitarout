package script;

import org.testng.annotations.Test;

import generic.SuperScript;
import pom.SearchPage;

public class TestSearchTextBox extends SuperScript
{
	@Test
	public void searchBoxValidation()
	{
		SearchPage search=new SearchPage(driver);
		search.enterDataForSearch("Puma T-Shirts");
		log.info("Searching product entered");
		
		search.clickOnSearch();
		log.info("Search btn clicked");
	}

}
