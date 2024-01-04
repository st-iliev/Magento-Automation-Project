Feature: Registration functionality

  Background:
    Given the user is on registration page

  Scenario : Registration a new user is unsuccessful without credentials
    When the user leaves the registration form blank
    And  clicks on the "Create an Account" button
    Then the user should see an error message "This is a required field." under required fields

  Scenario Outline: Registration a new user is successful with valid credentials
    When the user fills "<firstName>", "<lastName>", "<emailAddress>", "<password>" and "<confirmPassword>" fields
    And  clicks on the "Create an Account" button
    Then the user is redirected to account page
    Examples:
      | firstName | lastName | emailAddress           | password      | confirmPassword |
      | Ron       | Vezov    | justfortest777@abv.bg  | Qaautomation! | Qaautomation!   |

  Scenario Outline: Registration a new user with missing credential
    When the user fills "<firstName>", "<lastName>", "<emailAddress>", "<password>", and "<confirmPassword>" fields
    And  clicks on the "Create an Account" button
    Then the user should see an error message under field with missing credental
    Examples:
      | firstName | lastName | emailAddress           | password      | confirmPassword |
      |           | Smith    | invalidEmail@gunit.com | Qaqweqwe!     | Qaqweqwe!       |
      | John      |          | invalidEmail@gunit.com | Qaqweqwe!     | Qaqweqwe!       |
      | John      | Smith    |                        | Qaqweqwe!     | Qaqweqwe!       |
      | John      | Smith    | invalidEmail@gunit.com |               | Qaqweqwe!       |
      | John      | Smith    | invalidEmail@gunit.com | Qaqweqwe!     |                 |
      | John      | Smith    | invalidEmail@gunit.com | Qaqweqwe!     | Qqprepre!       |