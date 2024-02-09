@smoke
Feature: F08_WishList | user could use wish list button ❤
  Scenario: user could add HTC One M8 to wishlist
    Given user adds HTCOneMAndroidLLollipop to wishlist
    Then  user adds HTCOneMAndroidLLollipop successfully

  Scenario: user adds HTC to CheckList and enters CheckList to make sure item is added
    Given user adds HTCOneMAndroidLLollipop to wishlist
    When  success message disspears
    And user clicks on WishList
    Then user make sure quanity is right
