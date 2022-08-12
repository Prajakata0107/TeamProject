package testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import config.BaseTest;
import config.HomepageDemo;
import keywords.UIKeywords;

public class MenTestCases extends BaseTest {
	@Test
	public void SearchPopularityResult() {
		UIKeywords.LaunchUrl(utility.EnvironmentA.URL);
		//HomepageDemo h = new HomepageDemo();
		HomepageDemo h= PageFactory.initElements(UIKeywords.driver, HomepageDemo.class);
		h.hoverOnMenMenu();
		System.out.println("hover on menMenu");
		h.clickOnTopWear();
		System.out.println("click on topwear");
		// h.clickOnMenTshirt();
		MenTshirtPage men = new MenTshirtPage();
		//WaitFor.elementToBePresent(men.sortByFilter);
		men.clickOnSortByFilter();
		
	//	log.info("click on sortBy filter");
		
	   // men.clickOnPopularityFilter();
//		System.out.println("click on topwear")
		// shome.clickOnMenTshirt();
		// home.hoverOnSortByFilter();
		// MenTshirtPage page = new MenTshirtPage();
		// page.clickOnSortByFilter();

	}
}