Feature: Test case page
  @TC_07
  Scenario: User verify test cases page
    Given Navigate to urla "https://automationexercise.com"
    And Verify that home page is visible successfully
    When Click on Test Cases button
    Then Verify user is navigated to test cases page successfully


