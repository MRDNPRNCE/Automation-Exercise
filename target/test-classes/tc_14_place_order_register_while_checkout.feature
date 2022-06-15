@register_while_checkout
Feature: TC_14_Place Order: Register while Checkout

  Scenario Outline: TC_14
    Given Navigate to "app_url"
    Then Verify that home page is visible successfully
    And Add products to cart
    And Click View Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click Register and Login button
    And Fill all details in Signup and create account
    Then Verify ACCOUNT CREATED! and click Continue button
    Then Verify Logged in as username at top
    And Click Cart button
    And Click Proceed To Checkout button
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: "<nameOnCard>" "<cardNumber>" "<cvcButton>" "<expirationDate>" "<expirationYear>"
    And Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button
    Examples:
    |nameOnCard|cardNumber      |cvcButton   |expirationDate|expirationYear|
    |ica       |1232123212321231|999         | 20           |2022          |