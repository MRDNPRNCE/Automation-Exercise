Feature: Test case page
  Scenario: User verify test cases page
    And User launch browser
    When Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Click on 'Test Cases' button
    Then Verify user is navigated to test cases page successfully