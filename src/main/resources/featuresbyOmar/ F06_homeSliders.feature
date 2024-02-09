@smoke
Feature:  Sliders feature

  Scenario: user could go to lumia phone page by clicking on first slider
    #Given user go to main page
    When user clicks on first slider
    Then user goes to lumia phone webpage

  Scenario: user could go to iphone6 page by clicking on seoncd slider
    #Given user go to main page
    When  user clicks on  second slider
    Then  user goes to iphone page
