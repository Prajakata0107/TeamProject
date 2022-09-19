package config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import keywords.UIKeywords;
import keywords.Waitfor;

public class HomeTwo {
	@FindBy(xpath = "//div[@class=\"desktop-navLink\"]/a[contains( text(), 'Men')]")
	public WebElement MenMenu;
	@FindBy(xpath = "//a[@href='men-tshirts'] ")
	public WebElement MenTshirt;
	@FindBy(xpath = "//a[contains(text(),\"Topwear\")]")
	public WebElement menu_Topwear;
	@FindBy(xpath ="//a[contains(text(),'Formal Shirts')]")
	public WebElement FormalShirts;
	@FindBy(xpath = "(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]")
	public WebElement CasualShirt;
	@FindBy(xpath = "(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Sweatshirts')]")
	public WebElement sweatshirts;
	@FindBy(xpath = "//ul[@class=\"results-base\"]/li[@class=\"product-base\"]/a[@href=\"sweatshirts/hm/hm-men-black-relaxed-fit-hoodie/15193748/buy\"]")
	public WebElement onesweatshirt;
	@FindBy(xpath = "//img[@title=\"max Men Black Turtle Neck Sweater\"]")
	public WebElement Swe;
	public HomeTwo() {
		PageFactory.initElements(UIKeywords.driver,this);
	}
  
	public void hoverOnMenMenu() {
		UIKeywords.mouseMove(MenMenu);
	}
	
	public void clickOnMenTshirt() {
		UIKeywords.click(MenTshirt);
	}
	public void clickOnCasualShirt() {
		UIKeywords.click(CasualShirt);
	}
	public void clickOnSweatShirt() {
    UIKeywords.click(sweatshirts);
	}
	public void clickOnOneSweatShirt() {
    UIKeywords.click(onesweatshirt);
	}
	public void clickOnSwe() {
		UIKeywords.click(Swe);
	}


	public void clickOnFormalShirts() {
		Waitfor.time(3);
		UIKeywords.click(FormalShirts);
	}
}
