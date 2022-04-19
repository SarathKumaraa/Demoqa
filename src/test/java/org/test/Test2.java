package org.test;

import org.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.ContactDetailsPage;
import org.pages.HomePage;
import org.pages.ProductDetailsPage;
import org.pages.ProductList;

import hooks.HooksClass;
import io.cucumber.java.en.*;

public class Test2 extends BaseClass {

	@When("The user has to select  Men's footwear in the Men's icon button")
	public void the_user_has_to_select_men_s_footwear_in_the_men_s_icon_button() {

		HomePage hp = new HomePage();
		hp.moveToElement(hp.getMenIcon());
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.elementToBeClickable(hp.getMenfootWear()));
		hp.getMenfootWear().click();

	}

	@When("The user has to select the third product")
	public void the_user_has_to_select_the_third_product() {

		ProductList pl = new ProductList();
		pl.getProductsName().get(2).click();
	}

	@Then("The user has to print the product name and price of the product")
	public void the_user_has_to_print_the_product_name_and_price_of_the_product() {

		ProductDetailsPage pdp = new ProductDetailsPage();
		System.out.println(pdp.getProductsName().getText());
		System.out.println(pdp.getProductPrice().getText());

	}

	@When("The user has to search books in searchbox and click and submit button")
	public void the_user_has_to_search_books_in_searchbox_and_click_and_submit_button() {

		HomePage hp = new HomePage();
		hp.getSearchBox().sendKeys("books");
		hp.getSubmitBtn().click();

	}

	@Then("the user has to print all the books name")
	public void the_user_has_to_print_all_the_books_name() {

		ProductList pl = new ProductList();
		int size = pl.getProductsName().size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println(pl.getProductsName().get(i).getText());

		}
	}

	@When("The user has to search laptop")
	public void the_user_has_to_search_laptop1() {

		HomePage hp = new HomePage();
		hp.getSearchBox().sendKeys("laptop");
		hp.getSubmitBtn().click();

	}

	@Then("The user has to click buynow")
	public void the_user_has_to_click_buynow() {

		ProductList pl1 = new ProductList();
		pl1.getProductsName().get(1).click();

	}

	@Then("The user has to fill the contact details page")
	public void the_user_has_to_fill_the_contact_details_page() {

		ProductDetailsPage pdp = new ProductDetailsPage();
		pdp.getWatchBuyBtn().click();

		ContactDetailsPage cdp = new ContactDetailsPage();
		cdp.getEmailInfo().sendKeys("sarath@123");
		sendkeys(cdp.getNameInfo(), "sa");
		sendkeys(cdp.getLastNameInfo(), "kumar");
		sendkeys(cdp.getAddressInfo(), "chennai");
		sendkeys(cdp.getCityInfo(), "chemmai");
		sendkeys(cdp.getPhoneInfo(), "123456");
		click(cdp.getContinueBtn());

	}

	@Then("The user has to click the continue shopping")
	public void the_user_has_to_click_the_continue_shopping() {

		ContactDetailsPage cdp = new ContactDetailsPage();

		click(cdp.getContinueBtn());

	}

}
