Feature: TC_24_Download Invoice after purchase order
 @download
 Scenario: TC_24
   Given  Navigate to url 'http://automationexercise.com'
   Then Verify that home page is visible successfully
   And Add products to cart
   Then Click Cart button
   And Verify that cart page is displayed
   Then Click Proceed To Checkout
   And Click Register / Login button
   Then Fill all details in Signup and create account
   And Verify ACCOUNT CREATED! and click Continue button
  Then Verify  Logged in as username at top
  And Click Cart2 button
  # And Click Proceed To Checkout button
  # Then Verify Address Details and Review Your Order
  # And Enter description in comment text area and click Place Order
  # Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
  # And Click Pay and Confirm Order button
  # Then Verify success message Your order has been placed successfully!
  # And Click Download Invoice button and verify invoice is downloaded successfully.
  # Then Click Continue button
  # And Click Delete Account button
  # And Verify ACCOUNT DELETED! and click Continue button

