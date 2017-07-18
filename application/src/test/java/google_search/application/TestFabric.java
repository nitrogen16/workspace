package google_search.application;

public class TestFabric {
	public static Browser createTest(BrowserName name){
		switch(name){
		case CHROME:
			new GoogleSearch().doesWebDriverWork();
			break;
		case MOZILLA:
			new MozillaSearch().doesWebDriverWork();
			break;
		default:
			break;
		}
		return null;

	}
}
