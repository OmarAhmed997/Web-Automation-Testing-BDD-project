@smoke

Feature:  F04_Search | users search functionality

  Scenario Outline: users could use search bar successfully using Name
    Given user go to login page
    When user login with valid "t311est@example.com" and "P@ssw0rd"
    And user search by "<ProductName>" and use search button And shows number of search results
    Then url contains "https://demo.nopcommerce.com/search?q="
   # Then Verify searched item name is in result searched items
    #2.2- Create for loop and verify each result contains the search word
     #You should use toLowerCase() method
    Examples:
      | ProductName |
      | book        |
      | laptop      |
      | nike        |





  Scenario Outline: users could use search bar successfully using SKU
    Given user go to login page
    When user login with valid "t31est@example.com" and "P@ssw0rd"
    And user search by "<ProductSKU>" and press enter
    And user clicks on product appeared in search
    Then users ProductSKU is successfully is the same of searched "<ProductSKU>"

     Examples:
       | ProductSKU |
       | SCI_FAITH  |
       | APPLE_CAM  |
       | SF_PRO_11  |

