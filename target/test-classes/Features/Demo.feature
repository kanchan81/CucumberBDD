Feature: Google search page

    Scenario: search in google
    Given I am on google search page
    When I entered java and click on search
    Then page title must start with java
  

    
