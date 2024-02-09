@smoke
Feature: user could choose between currencies
  Scenario: user could choose € currency
    Given user go to login page
    When user login with valid "t311est@example.com" and "P@ssw0rd"
    And user press on login button
    And user select "Euro" currency from the dropdown list
   Then user choose € currency successfully
