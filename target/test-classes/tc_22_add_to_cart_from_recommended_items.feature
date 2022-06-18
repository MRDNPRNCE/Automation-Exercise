Feature: Test Case 22: Add to cart from Recommended items
  @recommendedItems
  Scenario: TC_22
    Given Navigate to "app_url"
    And Scroll to bottom of page
    Then Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
    And Click on View Cart button
    Then Verify that product is displayed in cart page

