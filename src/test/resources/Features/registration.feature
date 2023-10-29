Feature: Registration functionality

  Background:
    Given user is on registration page

  Scenario : Check registration without credentials
    When user fills the registration form with "<firstName>", "<lastName>", "<emailAddress>", "<password>", and "<confirmPassword>"
    And click on "Create an Account" button
    Then user should see an errors messages under each required fields

  Scenario Outline: Check registration is successful with valid credentials
    When user fills registration form with "<firstName>", "<lastName>", "<emailAddress>", "<password>", and "<confirmPassword>"
    And clicks on the "Create an Account" button
    Then user is redirected to account page

    Examples:
      | firstName | lastName | emailAddress           | password      | confirmPassword |
      | Ron       | Vezov    | justfortest777@abv.bg  | Qaautomation! | Qaautomation!   |
      |           | Smith    | invalidEmail@gunit.com | Qaqweqwe!     | Qaqweqwe!       |
      | John      |          | invalidEmail@gunit.com | Qaqweqwe!     | Qaqweqwe!       |
      | John      | Smith    |                        | Qaqweqwe!     | Qaqweqwe!       |
      | John      | Smith    | invalidEmail@gunit.com |               | Qaqweqwe!       |
      | John      | Smith    | invalidEmail@gunit.com | Qaqweqwe!     |                 |
      | John      | Smith    | invalidEmail@gunit.com | Qaqweqwe!     | Qqprepre!       |