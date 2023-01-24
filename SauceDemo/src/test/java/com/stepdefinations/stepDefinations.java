package com.stepdefinations;

import org.openqa.selenium.WebDriver;

import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.loginPage;

public class stepDefinations extends Utility {

	public stepDefinations(WebDriver driverInstance) {
		super(driverInstance);
	}

	public stepDefinations() {
	}

	@Given("user is on Sauce Demo website login page")
	public void user_is_on_sauce_demo_website_login_page() throws Exception {
		try {
			loginPage.launchApp("Sauce Demo");
		} catch (Exception e) {
			throw e;
		}
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws Exception {
		try {
			loginPage.clickSubmit();
		} catch (Exception e) {
			throw e;
		}
	}

	@Given("user is on <app> website login page")
	public void user_is_on_app_website_login_page(String app) throws Exception {
		try {
			loginPage.launchApp(app);
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user enters the correct username and password")
	public void user_enters_the_correct_username_and_password()throws Exception {
		try {
			loginPage.submitCorrectDetails();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("homepage should be displayed.")
	public void homepage_should_be_displayed() throws Exception {
		try {
			loginPage.isHomepageDisplayed();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user enters the incorrect username and password")
	public void user_enters_the_incorrect_username_and_password()throws Exception {
		try {
			loginPage.submitIncorrectDetails();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("error meaages should be displayed.")
	public void error_meaages_should_be_displayed() throws Exception{
		try {
			loginPage.checkErrorMessage();
		} catch (Exception e) {
			throw e;
		}
	}
	@Given("user navigate to the login page")
	public void user_navigate_login_poage() throws Exception{
		try {
			loginPage.navigateToLoginPage();
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@When("user submit username and password")
	public void submit_username_password() throws Exception{
		try {
			loginPage.submitCorrectDetails();
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Then("user should be logged in")
	public void user_should_be_logged_in() throws Exception{
		try {
			loginPage.shouldBeLoggedIn();
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@Given("user is on homepage")
	public void user_is_on_homepage() throws Exception {
		try {
			loginPage.showHomePage();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("user should be able to see {int} product in the list")
	public void user_should_be_able_to_see_product_in_the_list(Integer int1) {
		try {
			loginPage.totalProducts(int1);
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user clicks on any product, details of that product should be displayed")
	public void user_clicks_on_any_product_details_of_that_product_should_be_displayed() {
		try {
			loginPage.productDetails();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user clicks on add to cart button on first product")
	public void user_clicks_on_add_to_cart_button_on_any_product() {
		try {
			loginPage.addProduct();
		} catch (Exception e) {
			throw e;
		}
	}

	
	@Then("product should be added in your cart")
	public void product_should_be_added_in_your_cart() {
		try {
			loginPage.checkCart();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user clicks on filter button")
	public void user_clicks_on_filter_button() {
		try {
			loginPage.clickSelectFilter();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("{int} filters should be displayed")
	public void filters_should_be_displayed(Integer int1) {
		try {
			loginPage.filterCount(int1);
		} catch (Exception e) {
			throw e;
		}
	}


	@When("user opens navigation menu")
	public void user_opens_navigation_menu() {
		try {
			loginPage.openNavigation();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("clicks on logout")
	public void clicks_on_logout() {
		try {
			loginPage.logOut();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("user should be logged out")
	public void user_should_be_logged_out() {
		try {
			loginPage.checkLogout();
		} catch (Exception e) {
			throw e;
		}
	}
	@When("user navigate to cart page and clicks on remove button of fisrt product")
	public void user_navigate_to_cart_page_and_clicks_on_remove_button_of_fisrt_product() {
		try {
			loginPage.navigateToCartAndRemove();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("the product should get removed")
	public void the_product_should_get_removed() {
		try {
			loginPage.checkIfRemoved();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user clicks on add to cart button on first and second product")
	public void user_clicks_on_add_to_cart_button_on_first_and_second_product() {
		try {
			loginPage.multipleAdd();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("{int} products should be added in your cart")
	public void products_should_be_added_in_your_cart(Integer int1) {
		try {
			loginPage.multipleCheck(int1);
		} catch (Exception e) {
			throw e;
		}
	}
	

	@When("user clicks on checkout and fills correct information on your information page")
	public void user_clicks_on_checkout_and_fills_correct_information_on_your_information_page() {
		try {
			loginPage.fillDetails();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("correct summary amount should be displayed in item total")
	public void correct_summary_amount_should_be_displayed_in_item_total() {
		try {
			loginPage.checkTotalAmount();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("user clicks on finish order should be placed with order placed message")
	public void user_clicks_on_finish_order_should_be_placed_with_order_placed_message() {
		try {
			loginPage.checkMessage();
		} catch (Exception e) {
			throw e;
		}
	}











}
