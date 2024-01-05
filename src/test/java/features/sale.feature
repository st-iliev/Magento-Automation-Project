Feature:  Sale page
  Background:
    Given the user is on the sale page

  Scenario Outline : User is redirect to the selected women's subcategory
    When the user clicks on the "<womensSubCategory>" on left side bar
    Then the user should be redirect on "<womensSubCategory>" page
    And  all products from this category should be displayed.
    Examples:
      | womensSubCategory     |
      | Hoodies & Sweatshirts |
      | Jackets               |
      | Tees                  |
      | Bras & Tanks          |
      | Pants                 |
      | Shorts                |

  Scenario Outline : User is redirect to the selected men's subcategory
    When the user clicks on the "<mensSubCategory>" on left side bar
    Then the user should be redirect on "<mensSubCategory>" page
    And  all products from this category should be displayed.
    Examples:
      | mensSubCategory       |
      | Hoodies & Sweatshirts |
      | Jackets               |
      | Tees                  |
      | Tanks                 |
      | Pants                 |
      | Shorts                |

  Scenario Outline : User is redirect to the selected gear subcategory
    When the user clicks on the "<gearSubCategory>" on left side bar
    Then the user should be redirect on "<gearSubCategory>" page
    And  all products from this category should be displayed.
    Examples:
      | gearSubCategory       |
      | Bags                  |
      | Fitness Equipment     |

  Scenario: User is successful redirect to Women Sale
    When the user clicks on the Women's Deals banner
    Then the user is redirected to the collection page
    And  all products from Women Sale should be displayed

  Scenario: User is successful redirect to Men Sale
    When the user scrolls down until they see banner with text Men's Bargains
    And  the user clicks on the Men's Bargains banner
    Then the user is redirected to the Men Sale page
    And  all products from Men Sale should be displayed

  Scenario: User is successful redirect to Gear page
    When the user scrolls down until they see banner with text Luma Gear Steals
    And  the user clicks on the Luma Gear Steals banner
    Then the user is redirected to the Gear page
    And  the page title should be Gear

  Scenario: User is successful redirect to Tees collection
    When the user scrolls down until they see banner with text Tees
    And  the user clicks on the Tees banner
    Then the user is redirected to the Tees collection
    And  all tees products should be displayed

  Scenario: Discount banner verification
    When the user scrolls down until they see discount banner with 20% OFF
    Then the discount banner should be displayed

  Scenario: Free shipping banner verification
    When the user scrolls down until they see  banner with text free shipping
    Then the free shipping banner should be displayed
