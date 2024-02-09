@smoke
Feature: HoverCategories feature

  Scenario: user could successfully choose between categories

    Given  user select a category
    When   user hoover over a category
    And   user select sub category RANDOM
    Then   Check if chosen SubCat equals Actual SubCat