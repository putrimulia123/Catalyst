Feature: feature to test login

  Scenario: Check login is successful with valid credentials
  
    Given user is on login page
    When user enters email and password
    And clicks on login button
    Then user is navigated to the home page