package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage extends BaseClass {

	public ContactDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email or mobile phone number']")
	private WebElement emailInfo;

	@FindBy(xpath = "//input[@placeholder='First name (optional)']")
	private WebElement nameInfo;

	@FindBy(xpath = "//input[@placeholder='Last name']")
	private WebElement lastNameInfo;

	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement addressInfo;

	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement cityInfo;

	@FindBy(xpath = "//input[@placeholder='Mobile Phone Number: - mark the above checkbox to get SMS updates.']")
	private WebElement phoneInfo;

	@FindBy(id = "continue_button")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//span[@class='skeleton-while-loading order-summary__emphasis']")
	private WebElement shippingPrice;
	
	@FindBy(xpath = "//*[@id=\"order-summary\"]/div/div[3]/table/tfoot/tr/td/span[2]")
	private WebElement totalPrice;

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getShippingPrice() {
		return shippingPrice;
	}

	public WebElement getEmailInfo() {
		return emailInfo;
	}

	public WebElement getNameInfo() {
		return nameInfo;
	}

	public WebElement getLastNameInfo() {
		return lastNameInfo;
	}

	public WebElement getAddressInfo() {
		return addressInfo;
	}

	public WebElement getCityInfo() {
		return cityInfo;
	}

	public WebElement getPhoneInfo() {
		return phoneInfo;

	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}