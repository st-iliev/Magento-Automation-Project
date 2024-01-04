Feature: Login functionality

  Background:
    Given the user is on the login page

  Scenario Outline : Unsuccessful login with invalid credentials
    When the user enters an invalid "<emailAddress>" and "<password>"
    And  clicks the "Sign In" button
    Then the user is unsuccessful login and should see an error message
    Examples:
      | emailAddress           | password         |
      | justfortest777@abv.bg  | InvalidPassword! |
      | invalidemail@gunit.com | Qaautomation!    |
      | invalidemail@gunit.com | InvalidPassword! |

  Scenario: Unsuccessful login without credentials
    When the user leavs login form blank
    And  clicks the "Sign In" button
    Then the user should see an messages "This is a required field." under email and password fields

  Scenario Outline : Successful login with valid credentials
    When the user enters "<emailAddress>" and "<password>"
    And  clicks the "Sign In" button
    Then the user is navigated to the home page
    And  welcome message with user's first and last name is appear in top right corner
    Examples:
      | emailAddress          | password      |
      | justfortest777@abv.bg | Qaautomation! |

  Scenario :  Successful redirection user to the registration page
    When  the user clicks on the "Create an Account" button
    Then  the user is redirected to registration page

  Scenario: Successful redirection user to the forgot password page
    When the user clicks on the "Sign InForgot Your Password" hyperlink
    Then the user is redirected to forgotpassword page

