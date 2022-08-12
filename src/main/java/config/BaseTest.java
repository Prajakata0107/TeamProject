package config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import keywords.UIKeywords;

public class BaseTest {
	@Parameters("browser-Name")
	@BeforeClass
	public void setUp(@Optional String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		} else if (browserName.isEmpty()) {
			browserName = "Chrome";
			System.out.println("default browser is chrome");
		}

		UIKeywords.openBrowser("Chrome");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		UIKeywords.CloseBrowser();

	}
}
