Feature:  Base page

  Scenario: The User logs out successfully
    Given the user is logged in
    When  the user clicks on the "customerMenuButton"
    And   the user clicks on the "Sign Out" button
    Then  message "You are signed out" is appear to the user
    And   the user is redirecred the Home page
    And   "Sign In or Create an Account" should be visible

  Scenario Outline: Compare products verification
    Given the the user is "<login_status>"
    When  the user scrolls down until they see text "Compare Products" on left side bar
    Then  all compares products should be displayed under the text "Compare Products"
    Examples:
      | login_status  |
      | Logged In     |
      | Non-Logged In |

  Scenario: Verify Compare products functionality
    Given the user is logged in
    When  the user scrolls down until they see text "Compare Products" on left side bar
    And   all compares products should be displayed under the text "Compare Products"
    Then  click on "Compare" button
    And   the user should be redirect to product compare page
    And   description for all compare products should be displayed


  Scenario: Remove one compare product
    Given the user is logged in
    When  the user scrolls down until they see text "Compare Products" on left side bar
    And   all compares products should be displayed under the text "Compare Products"
    Then  click on cross symbol on right side of compare product
    And   click on "OK" button
    And   compar product should be removed from "Compare Products"

  Scenario: Remove all compare product
    Given the user is logged in
    When  the user scrolls down until they see text "Compare Products" on left side bar
    And   all compares products should be displayed under the text "Compare Products"
    Then  click on "Clear All" link
    And   click on "OK" button
    And   all compar products should be removed from "Compare Products"

  Scenario Outline: Missing products in "Compare Products"
    Given the the user is "<login_status>"
    When  the user scrolls down until they see text "Compare Products" on left side bar
    Then  text "You have no items to compare." should be displayed under text "Compare Products"
    Examples:
      | login_status   |
      | Logged In      |
      | Non-Logged In  |

  Scenario: Verify "My Wish List" functionality
    Given the user is logged in
    When  the user scrolls down until they see text "My Wish List" on left side bar
    Then  click on "Go to Wish List"
    And   the user should be redirect to wishlist page
    And   all products in wishlist should be displayed

  Scenario: Remove one product from "My Wish List"
    Given the user is logged in
    And   the user has products in their wishlist
    When  the user scrolls down until they see the text "My Wish List" on the left sidebar
    Then  click on "cross" symbol on right side of first product in "My Wish List"
    And   a successful message "Leah Yoga Top has been removed from your Wish List." should be displayed
    And   the product should be removed from "My Wish List"

  Scenario Outline: Missing products in "My Wish List"
    Given the the user is "<login_status>"
    When  the user scrolls down until they see text "My Wish List" on left side bar
    Then  all compares products should be displayed under the text "Compare Products"
    Examples:
      | login_status  |
      | Logged In     |
      | Non-Logged In |