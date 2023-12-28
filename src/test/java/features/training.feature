Feature: Training page
  Background:
    Given the user is on the training page

  Scenario: User is successful redirect to training page
    When  the user clicks on the banner with text "Motivate yourself"
    Then  the user is redirected to the training page
    And   page title "Training" should be displayed

  Scenario: User is successful redirect to Erin Recommends products
    When  the user scrolls down until they see banner with text "pro trainer Erin Renny"
    And   the user clicks on the banner
    Then  the user is redirected to the page with Erin Recommends products
    And   all Erin recommends products should be displayed

  Scenario: User is successful redirect from banner to Video Download page
    When  the user scrolls down until they see banner with text "Training on demand"
    And   the user clicks on the banner
    Then  the user is redirected to the Video Download page
    And   page title "Video Download" should be displayed

  Scenario: User is successful redirect from side bar to Video Download page
    When  the user clicks on "Video Download" link on left side bar
    Then  the user is redirected to the Video Download page
    And   page title "Video Download" should be displayed