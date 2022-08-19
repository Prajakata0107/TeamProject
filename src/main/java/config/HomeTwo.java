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

	public void clickOnFormalShirts() {
		Waitfor.time(3);
		UIKeywords.click(FormalShirts);
	}
}
