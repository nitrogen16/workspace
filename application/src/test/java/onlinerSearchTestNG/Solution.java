package onlinerSearchTestNG;

import org.testng.annotations.Test;

public class Solution extends FunctionalTest {
	@Test
	public void signUp() {
		OnlinerMainPage onlinerMainPage = new OnlinerMainPage(driver);
		OnlinerCatalogPage onlinerCatalogPage = onlinerMainPage.open().clickOnCatalogPage();
		onlinerCatalogPage.getElements();

		OnlinerForumPage onlinerForumPage = onlinerCatalogPage.clickOnForumPage();
		onlinerForumPage.getElements();
	}
}