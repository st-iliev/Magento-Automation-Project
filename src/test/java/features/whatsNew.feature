Feature:  WhatsNew page
  Background:
    Given the user is on the whatsnew page

  Scenario Outline : User is redirect to the selected women's subcategory
    When user clicks on the "<womensSubCategory>" on left side bar
    Then user should be redirect on Women "<womensSubCategory>" page
    And  all products from this category should be displayed
    Examples:
      | womensSubCategory     |
      | Hoodies & Sweatshirts |
      | Jackets               |
      | Tees                  |
      | Bras & Tanks          |
      | Pants                 |
      | Shorts                |

  Scenario Outline : User is redirect to the selected men's subcategory
    When user clicks on the "<mensSubCategory>" on left side bar
    Then user should be redirect on Men "<mensSubCategory>" page
    And  all products from this category should be displayed
    Examples:
      | mensSubCategory       |
      | Hoodies & Sweatshirts |
      | Jackets               |
      | Tees                  |
      | Tanks                 |
      | Pants                 |
      | Shorts                |

  Scenario: User is successful redirect to New Luma Yoga Collection
    When user clicks on the "New Luma Yoga Collection" banner
    Then user is redirected to the collection page
    And  all products from "New Luma Yoga Collection" should be displayed

  Scenario: User is successful redirect to Performance products collection
    When user clicks on the performance banner
    Then user is redirected to the "Performance Sportswear New" products
    And  all products from "Performance Sportswear New" collection should be displayed

  Scenario: User is successful redirect to Eco Friendly collection
    When user clicks on the eco banner
    Then user is redirected to the "Eco Collection New" products
    And  all "Eco Collection New" products should be displayed

  Scenario: Verify Luma's latest products are shown on bottom of page
    When user scrolls down until see text "Luma's Latest"
    Then all "Luma's latest products" are displayed under text "Luma's Latest"
