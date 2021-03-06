package onlinerSearch;

import org.junit.Test;

public class Solution extends FunctionalTest {
	
	@Test
	public void signUp() {

		OnlinerMainPage onlinerMainPage = new OnlinerMainPage(driver);
		OnlinerCatalogPage onlinerCatalogPage = onlinerMainPage.open().clickOnCatalog();
		onlinerCatalogPage.getElements();

		OnlinerForumPage onlinerForumPage = onlinerCatalogPage.clickOnForumPage();
		onlinerForumPage.getElements();
	}
}