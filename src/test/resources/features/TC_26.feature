Feature: Test case page
  @TC_26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    When Scroll down page to bottom
    And Verify SUBSCRIPTION is visible
    And Scroll up page to top
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen