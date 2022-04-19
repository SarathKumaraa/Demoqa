package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductList extends BaseClass {
	
	public ProductList() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='product-item product-item--vertical  1/3--tablet-and-up 1/4--desk']")
	private List<WebElement> allProductsBox;
	
	@FindBy(xpath = "//a[@class='product-item__title text--strong link']")
	private List<WebElement> productsName;
	
	@FindBy(xpath = "//a[@class='product-item__title text--strong link']/following::div/span/span[2]")
	private List<WebElement> price;
	
	@FindBy(xpath = "(//span[@class='block-swatch__item-text'])[3]")
	private WebElement productName;
	
	@FindBy(xpath = "//span[@class='product-form__selected-value']")
	private WebElement selectedProductName;
	
	@FindBy(xpath = "//h1[@class='collection__title heading h1']")
	private WebElement productForWatches;

	public WebElement getProductForWatches() {
		return productForWatches;
	}

	public WebElement getSelectedProductName() {
		return selectedProductName;
	}

	public WebElement getProductName() {
		return productName;
	}

	public List<WebElement> getPrice() {
		return price;
	}

	public List<WebElement> getProductsName() {
		return productsName;
	}

	public List<WebElement> getAllProductsBox() {
		return allProductsBox;
	}
	
	
	

}