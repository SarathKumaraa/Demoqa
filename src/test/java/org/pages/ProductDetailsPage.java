package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BaseClass {

	public ProductDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='product-meta__title heading h1']")
	private WebElement productsName;

	@FindBy(xpath = "(//span[@class='money'])[2]")
	private WebElement productPrice;

	@FindBy(xpath = "//button[text()='Buy it now']")
	private WebElement buyBtn;

	public WebElement getProductsName() {
		return productsName;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}

	public WebElement getWatchBuyBtn() {
		return buyBtn;
	}

}
