
Feature: Login feature
 
  Scenario: Login with valid credential
    Given I am on login page
    When user entered valid username
    And user entered valid password
    And click on login button
    Then user redericts to the home page
  
