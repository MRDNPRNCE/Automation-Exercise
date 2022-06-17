Feature: Test case page
  @TC_17
  Scenario: Remove Products From Cart
    Given Navigate to urla "https://automationexercise.com"
    And Verify that home page is visible successfully
    When Add products to cart
    And Click Cart button MK
    And Verify that cart page is displayed
    And Click X button corresponding to particular product
    Then Verify that product is removed from the cart

