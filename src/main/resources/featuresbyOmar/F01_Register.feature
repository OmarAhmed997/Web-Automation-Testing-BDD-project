@smoke

Feature: user could register with new account
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "a1utomation" and last name "tester"
    And user enter date of birth day"17" And month"6" And year "1997"
    And user enter email "t311est@example.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed