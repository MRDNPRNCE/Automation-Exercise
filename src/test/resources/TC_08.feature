Feature: TC_08_Verify All Products and Product detail page
@verify
  Scenario: TC_08
    Given Navigate to url 'AutomationExerciseUrl'
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    Then Click on View Product of first product
    And  User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand