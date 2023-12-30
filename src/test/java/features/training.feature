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

  Scenario Outline:  User is redirect to the selected training's subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<trainingSubcategory>" on left side bar
    Then  user should be redirect on Training "<trainingSubcategory>" page
    And   a message "We can't find products matching the selection." should be displayed
    Examples:
      | trainingSubcategory | loginStatus   |
      | Video Download      | loggin in     |
      | Video Download      | non-logged in |
