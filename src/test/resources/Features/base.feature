Feature: Testing BasePage Class

  Scenario: User logs out successfully
    Given the user is logged in
    When the user clicks on the "customerMenuButton"
    And the user clicks on the "Sign Out" button
    Then the user is redirecred the Home page
    And the "Sign In" button should be visible

  Scenario: User clicks on My Account
    Given the user is logged in
    When the user clicks on the "customerMenuButton"
    And the user clicks on the "My Account" link
    Then the user is redirecred to  the My Account page

  Scenario: User clicks on My Wish List
    Given the user is logged in
    When the user clicks on the "customerMenuButton"
    And the user clicks on the "My Wish List" link
    Then the user should be on the My Wish List page


