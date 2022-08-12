package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import keywords.UIKeywords;

public class HomepageDemo {
	// public WebElement MenMenu;
	// @FindBy(xpath="//div[@class='desktop-navLink']/a[@href='shop/men'] ")
	public WebElement MenMenu;
	@FindBy(xpath = " //a[@href='men-tshirts'] ")
	public WebElement MenTshirt;
	@FindBy(xpath = "//a[contains(text(),'Topwear')] ")
	public WebElement menu_Topwear;
	// public WebElement sortByFilter;
	@FindBy(xpath = "(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]")
	public WebElement CasualShirt;

	public HomepageDemo() {
		MenMenu = UIKeywords.driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[@href=\"/shop/men\"]"));
		MenTshirt = UIKeywords.driver.findElement(By.xpath(" //a[@href=\"/men-tshirts\"]"));
		// menu_Topwear =
		// UIKeywordA.driver.findElement(By.xpath("//a[contains(text(),\"Topwear\")]"));
		// sortByFilter =
		// UIKeywordA.driver.findElement(By.xpath("//div[@class=\"sort-sortBy\"]"));
		CasualShirt = UIKeywords.driver.findElement(
				By.xpath("(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]"));
	}

	public void hoverOnMenMenu() {
		UIKeywords.mouseMove(MenMenu);
	}

	public void clickOnMenTshirt() {
		UIKeywords.click(MenTshirt);
	}

	public void clickOnTopWear() {
		UIKeywords.click(menu_Topwear);
	}

//
//	public void clickOnSortByFilter() {
//		UIKeywordA.click(sortByFilter);
//	}
//
//	public void hoverOnSortByFilter() {
//		UIKeywordA.mouseMove(sortByFilter);
//	}
	public void clickOnCasualShirt() {
		UIKeywords.click(CasualShirt);
	}
}
