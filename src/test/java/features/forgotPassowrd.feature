Feature:  ForgotPassword functionality
  Background:
    Given the user is on the forgot password page

  Scenario: Verify email field validation
    When  the user leavs email field  blank
    And   clicks the "Reset My Password" button
    Then  an error message "This is a required field." should be displayed under email field

  Scenario Outline: Unsuccessful reset password with invalid credential
    When  the user fills email field with "<invalid_credential>"
    And   clicks on the "Reset My Password" button
    Then  an error message should be displayed under email field:
          """
          "Please enter a valid email address (Ex: johndoe@domain.com)."
          """

    Examples:
       | invalid_credential |
       | test               |
       | test@              |
       | test@gmail         |

  Scenario: Successful reset password
    When  the user fills email field with "test@gmail.com"
    And   clicks on the "Reset My Password" button
    Then  the user is redirect to login page
    And   an message  should be displayed:
          """
          "If there is an account associated with test@gmail.com you will receive an email with a link to
          And   reset your password."
          """







