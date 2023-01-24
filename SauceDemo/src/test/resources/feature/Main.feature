@FullSuite
Feature: Functionality

 Background: User is Logged In
	Given user navigate to the login page
	When user submit username and password
	Then user should be logged in 

  @Browser_products
  Scenario: product list
    Given user is on homepage
    Then user should be able to see 6 product in the list

  @Product_details
  Scenario: product details
    Given user is on homepage
    When user clicks on any product, details of that product should be displayed

  @filter_product
  Scenario: filter product
    Given user is on homepage
    When user clicks on filter button
    Then 4 filters should be displayed

  @Add_product
  Scenario: add product
    Given user is on homepage
    When user clicks on add to cart button on first product
    Then product should be added in your cart

  @Remove_product
  Scenario: remove product
    Given user is on homepage
    When user clicks on add to cart button on first product
    And user navigate to cart page and clicks on remove button of fisrt product
    Then the product should get removed

  @Multiple_product
  Scenario: add_multiple_product
    Given user is on homepage
    When user clicks on add to cart button on first and second product
    Then 2 products should be added in your cart

  @Successful_order
  Scenario: successful order
    Given user is on homepage
    When user clicks on add to cart button on first and second product
    Then 2 products should be added in your cart
    When user clicks on checkout and fills correct information on your information page
    Then correct summary amount should be displayed in item total
    When user clicks on finish order should be placed with order placed message

  @log_out
  Scenario: log_out
    Given user is on homepage
    When user opens navigation menu
    And clicks on logout
    Then user should be logged out
