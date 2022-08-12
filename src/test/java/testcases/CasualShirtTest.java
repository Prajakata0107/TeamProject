package testcases;


import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import config.BaseTest;
import homepage.CasualShirtsPage;
import keywords.UIKeywords;
import utility.EnvironmentA;

public class CasualShirtTest extends BaseTest {
	private static final Logger log = Logger.getLogger(CasualShirtTest.class);
	@Test
	public void verifyTheitemCountForCasualTShirts() {
		UIKeywords.LaunchUrl(EnvironmentA.URL);
		config.HomepageDemo h = new config.HomepageDemo();
		h.hoverOnMenMenu();
		System.out.println("hover on men menu");
		h.clickOnCasualShirt();
		System.out.println("click on CasualShirt");
		CasualShirtsPage c = new CasualShirtsPage();
		int intcount = c.getItemCount();
		System.out.println(intcount);
		log.info(" hi");

	}
}

