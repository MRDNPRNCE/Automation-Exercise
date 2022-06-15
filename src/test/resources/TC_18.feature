Feature: TC_18_View Category Products
@visible
  Scenario: TC_18
    Given Navigate to url 'AutomationExerciseUrl'
    Then Verify that categories are visible on left side bar
    And Click on Women category
    Then Click on any category link under Women category, for example: Dress
    And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    And  On left side bar, click on any sub-category link of Men category
    #Then Verify that user is navigated to that category page