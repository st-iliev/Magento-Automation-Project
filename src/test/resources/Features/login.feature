Feature: Login Functionality

  Background:
    Given the user is on the login page

  Scenario Outline : Unsuccessful login with invalid credentials
    When the user enters an invalid "<emailAddress>" and "<password>"
    And clicks the "Sign In" button
    Then the user is "<login_status>" login and should see an error message
    Examples:
      | emailAddress           | password         | login_status |
      | justfortest777@abv.bg  | InvalidPassword! | unsuccessful |
      | invalidemail@gunit.com | Qaautomation!    | unsuccessful |
      | invalidemail@gunit.com | InvalidPassword! | unsuccessful |

  Scenario Outline: Successful login with valid credentials
    When the user enters "<emailAddress>" and "<password>"
    And clicks the "Sign In" button
    Then the user is "<login_status>" login and navigated to the home page
    Examples:
      | emailAddress           | password         | login_status |
      | justfortest777@abv.bg  | Qaautomation!    | successful   |

 Scenario :  Successful redirection  to the registration page
   When the user clicks on the "Create an Account" button
   Then  user is redirecred to registration page

