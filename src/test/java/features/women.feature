Feature: Women page

  Background:
    Given the user is on women page

  Scenario Outline : User is redirect to the selected women's tops subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<topsSubcategory>" on left side bar
    Then  user should be redirect on Women "<topsSubcategory>" page
    And   all products from this category should be displayed

    Examples:
    | topsSubcategory       | loginStatus   |
    | Hoodies & Sweatshirts | loggin in     |
    | Jackets               | loggin in     |
    | Tees                  | loggin in     |
    | Bras & Tanks          | loggin in     |
    | Hoodies & Sweatshirts | non-logged in |
    | Jackets               | non-logged in |
    | Tees                  | non-logged in |
    | Bras & Tanks          | non-logged in |

  Scenario Outline : User is redirect to the selected women's bottoms subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<bottomsSubcategory>" on left side bar
    Then  user should be redirect on Women "<bottomsSubcategory>" page
    And   all products from this category should be displayed

    Examples:
      | bottomsSubcategory |  loginStatus   |
      | Pants              |  loggin in     |
      | Shorts             |  loggin in     |
      | Pants              |  non-logged in |
      | Shorts             |  non-logged in |

  Scenario Outline:  User is redirect to the selected women's subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<womensSubcategory>" on left side bar
    Then  user should be redirect on Women "<womensSubcategory>" page
    And   all products from this category should be displayed
    Examples:
      | womensSubcategory |  loginStatus   |
      | Tops              |  loggin in     |
      | Bottoms           |  loggin in     |
      | Tops              |  non-logged in |
      | Bottoms           |  non-logged in |

  Scenario: User is successful redirect to New Luma Yoga Collection
    When  user clicks on the "New Luma Yoga Collection" banner
    Then  user is redirected to the collection page
    And   all products from "New Luma Yoga Collection" should be displayed

  Scenario: User is successful redirect to Women Tees products
    When  the user scrolls down until they see banner with text "You can't have too many tees"
    And   user clicks on the tees banner
    Then  user is redirected to the "Women Tees" products
    And   all women tees products should be displayed

  Scenario: User is successful redirect to Women Pants products
    When  the user scrolls down until they see banner with text "Hot pants"
    When  user clicks on the "Pants" banner
    Then  user is redirected to the "Women Pants" products
    And   all women pants products should be displayed

  Scenario: User is successful redirect to Erin Recommends products
    When  the user scrolls down until they see banner with text "What would Erin wear?"
    And   the user clicks on the erin banner
    Then  the user is redirected to the page with Erin Recommends products
    And   all Erin recommends products should be displayed

  Scenario: User is successful redirect to Luma Women Pants products
    When  the user scrolls down until they see banner with text "Luma pants"
    When  user clicks on the "Luma pants" banner
    Then  user is redirected to the "Women Pants" products
    And   all women pants products should be displayed

  Scenario: User is successful redirect to Luma Women Shorts products
    When  the user scrolls down until they see banner with text "Luma shorts"
    When  user clicks on the "Luma shorts" banner
    Then  user is redirected to the "Women Shorts" products
    And   all women shorts products should be displayed

  Scenario: User is successful redirect to Luma Women Bras & Tanks products
    When  the user scrolls down until they see banner with text "Luma Bras Tanks"
    When  user clicks on the "Luma Bras Tanks" banner
    Then  user is redirected to the "Women Bras & Tanks" products
    And   all women bras and tanks products should be displayed

  Scenario: Verify Favourites products are shown on bottom of page
    When  user scrolls down until see text "Hot Sellers"
    Then  four "Favourites products" should be displayed under title "Hot Sellers"