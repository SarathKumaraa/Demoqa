package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='search-bar__input']")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@class='search-bar__submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "(//a[@class='nav-bar__link link'])[2]")
	private WebElement elecrtonicBtn;
	
	@FindBy(xpath = "(//a[@class='nav-bar__link link'])[3]")
	private WebElement beautyAndFashionList;
	
	@FindBy(xpath = "//*[@id=\"desktop-menu-0-3\"]/li[4]/a")
	private WebElement skinCareIcon;
	
	@FindBy(xpath = "(//a[@class='nav-bar__link link'])[4]")
	private WebElement menIcon;
	
	@FindBy(xpath = "//*[@id=\"desktop-menu-0-4\"]/li[3]/a")
	private WebElement menfootWear;

	public WebElement getMenfootWear() {
		return menfootWear;
	}

	public WebElement getMenIcon() {
		return menIcon;
	}

	public void setMenIcon(WebElement menIcon) {
		this.menIcon = menIcon;
	}

	public WebElement getSkinCareIcon() {
		return skinCareIcon;
	}

	public WebElement getBeautyAndFashionList() {
		return beautyAndFashionList;
	}

	@FindBy(xpath = "/html/body/div[4]/section/nav/div/div/ul/li[2]/ul/li[3]/a")
	private WebElement homeApplianceBtn;

	@FindBy(xpath = "(//a[@class='nav-bar__link link'])[4]")
	private WebElement menBox;

	@FindBy(xpath = "//a[text()='Men's Perfumes']")
	private WebElement menPerfumeBox;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getElecrtonicBtn() {
		return elecrtonicBtn;
	}

	public WebElement getHomeApplianceBtn() {
		return homeApplianceBtn;
	}

	public WebElement getMenBox() {
		return menBox;

	}

	public WebElement getMenPerfumeBox() {
		return menPerfumeBox;
	}
}
