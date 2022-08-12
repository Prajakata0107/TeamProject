package homepage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import keywords.UIKeywords;

public class CasualShirtsPage {
	private static final Logger log = Logger.getLogger(CasualShirtsPage.class);
	public By iteamCount = By.xpath("//span[@class='title-count']");

	public int getItemCount() {
		String items = UIKeywords.driver.findElement(iteamCount).getText();
		Pattern p = Pattern.compile("//d");
		Matcher m = p.matcher(items);
		String count = m.group();
		return Integer.parseInt(count);

	}
}
