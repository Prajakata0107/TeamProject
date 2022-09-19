package config;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import homepage.CasualShirtsPage;
import keywords.UIKeywords;
import utility.EnvironmentA;

public class BaseTest {
//	public ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();
//	private static final Logger log = Logger.getLogger(BaseTest.class);
//	@Parameters("browser-Name")
//	@BeforeMethod
//	public void setUp(@Optional String browserName) throws Exception {
//		if (browserName == null) {
//			browserName = "Chrome";
//		} else if (browserName.isEmpty()) {
//			browserName = "Chrome";
//			System.out.println("default browser is chrome");
//		}
//
//		UIKeywords.openBrowser("Chrome");


	@Parameters("browser-Name")
	@BeforeMethod
	public void setUp(@Optional String browserName) throws Exception {
		
		if (browserName == null) {
			browserName = "Chrome";
		}
		  if(browserName.isEmpty()) {
			browserName = "Chrome";
			System.out.println("default browser is chrome");
		}

		UIKeywords.openBrowser(browserName);
	}
	@AfterMethod
	public void tearDown() throws Exception {
		UIKeywords.CloseBrowser();
	}
}
