package testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import config.BaseTest;
import config.HomeTwo;
import config.HomepageDemo;
import keywords.UIKeywords;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class MenTestCases extends BaseTest {

	@Test
	public void SearchPopularityResult() {
		UIKeywords.LaunchUrl(utility.EnvironmentA.URL);
		HomepageDemo h = new HomepageDemo();
		// HomepageDemo h= PageFactory.initElements(UIKeywords.driver,
		// HomepageDemo.class);
		h.hoverOnMenMenu();
		System.out.println("hover on menMenu");
		h.clickOnTopWear();
		System.out.println("click on topwear");
		// h.clickOnMenTshirt();
		// MenTshirtPage men = new MenTshirtPage();
		// WaitFor.elementToBePresent(men.sortByFilter);
		// men.clickOnSortByFilter();

		// log.info("click on sortBy filter");

		// men.clickOnPopularityFilter();
//		System.out.println("click on topwear")
		// shome.clickOnMenTshirt();
		// home.hoverOnSortByFilter();
		// MenTshirtPage page = new MenTshirtPage();
		// page.clickOnSortByFilter();

	}

	@Test
	public void searchForFormalShirts() {
		UIKeywords.LaunchUrl(utility.EnvironmentA.URL);
		// HomepageDemo h = new HomepageDemo();
		HomeTwo h = new HomeTwo();
		h.hoverOnMenMenu();
		System.out.println("hover on men menu");
		h.clickOnFormalShirts();
		AShot ash = new AShot ();
		ash.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		System.out.println("Scrolling done");
		Screenshot sc =ash.takeScreenshot(UIKeywords.driver);
		 BufferedImage img =sc.getImage();
		 try {
			ImageIO.write(img, "PNG",new File("UUUsingAshotignore.png"));
		} catch (IOException e) {
			e.printStackTrace();
	}
}
}
