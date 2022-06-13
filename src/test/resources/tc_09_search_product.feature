Feature: TC_09_Search_Product

  @search
  Scenario: TC_09
    Given Navigate to "app_url"
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter "product name" in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible