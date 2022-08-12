package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import keywords.UIKeywords;

public class HomePage {

	public WebElement sortByFilter;
	public WebElement countryOfOrigin;

	public HomePage() {
		sortByFilter = UIKeywords.driver.findElement(By.xpath(" "));
		countryOfOrigin = UIKeywords.driver.findElement(By.xpath(" "));
	}

	public void clickOnSortByFilter() {
		sortByFilter.click();
	}
}
