package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import keywords.UIKeywords;

public class MenTshirtPage {

	public WebElement sortByFilter;
	public WebElement countryOfOrigin;

	public MenTshirtPage() {
		sortByFilter = UIKeywords.driver.findElement(By.xpath(" "));
		countryOfOrigin = UIKeywords.driver.findElement(By.xpath(" "));
	}

	public void clickOnSortByFilter() {
		sortByFilter.click();
	}
}
