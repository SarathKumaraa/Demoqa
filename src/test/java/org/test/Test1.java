package org.test;

import org.base.BaseClass;
import org.pages.HomePage;
import org.pages.ProductDetailsPage;
import org.pages.ProductList;

import io.cucumber.java.en.*;

public class Test1 extends BaseClass {

	@Given("The user has to be in home page")
	public void the_user_has_to_be_in_home_page() {

		launchBrowser();
		getUrl("https://tuzzut.com/");
		waitAll();
		

	}

	@When("The user should search laptop in  search box")
	public void the_user_should_search_laptop_in_search_box() {

		HomePage hp = new HomePage();
		hp.getSearchBox().sendKeys("laptop");
		hp.getSubmitBtn().click();

	}

	@When("The user has to select the first product")
	public void the_user_has_to_select_the_first_product() {

		ProductList pl = new ProductList();
		pl.getProductsName().get(0).click();

	}

	@When("The user has to print the product name and price")
	public void the_user_has_to_print_the_product_name_and_price() {

		ProductDetailsPage pdp = new ProductDetailsPage();
		System.out.println(pdp.getProductsName().getText());
		System.out.println(pdp.getProductPrice().getText());

	}

	@Then("The user has to validate the price and the user go  backward if the price is more that QAR {int}")
	public void the_user_has_to_validate_the_price_and_the_user_go_backward_if_the_price_is_more_that_qar(Integer int1) {
	    
	
		ProductDetailsPage pdp = new ProductDetailsPage();

		String price = pdp.getProductPrice().getText();
		System.out.println(price);
		String[] Split = price.split(" ");

		double parsedouble = Double.parseDouble(Split[1]);

		if (parsedouble < 100.0) {
			System.out.println(pdp.getProductPrice().getText());

		} else {
			backward();
		}

	}

	@Then("The user has to select the second product")
	public void the_user_has_to_select_the_second_product() {
		
		ProductList pl = new ProductList();
		pl.getProductsName().get(1).click();

	}

}
