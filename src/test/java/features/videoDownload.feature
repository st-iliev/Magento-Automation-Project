Feature: VideoDownload page

  Background:
    Given the user is on video download page

  Scenario: Missing videos on current page
    And   page title "Video Download" should be displayed
    Then  none video should be displayed
    And   a warning message should be displayed
          """
          "We can't find products matching the selection."
          """