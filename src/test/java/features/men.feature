Feature: Men page

  Background:
    Given the user is on men page

  Scenario Outline:  User is redirect to the selected men's subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<mensSubcategory>" on left side bar
    Then  user should be redirect on Men "<mensSubcategory>" page
    And   all products from this category should be displayed
    Examples:
      | mensSubcategory | loginStatus   |
      | Tops            | loggin in     |
      | Bottoms         | loggin in     |
      | Tops            | non-logged in |
      | Bottoms         | non-logged in |

  Scenario Outline : User is redirect to the selected men's tops subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<topsSubcategory>" on left side bar
    Then  user should be redirect on Men "<topsSubcategory>" page
    And   all products from this category should be displayed

    Examples:
      | topsSubcategory       | loginStatus   |
      | Hoodies & Sweatshirts | loggin in     |
      | Jackets               | loggin in     |
      | Tees                  | loggin in     |
      | Tanks                 | loggin in     |
      | Hoodies & Sweatshirts | non-logged in |
      | Jackets               | non-logged in |
      | Tees                  | non-logged in |
      | Tanks                 | non-logged in |

  Scenario Outline : User is redirect to the selected men's bottoms subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<bottomsSubcategory>" on left side bar
    Then  user should be redirect on Men "<bottomsSubcategory>" page
    And   all products from this category should be displayed

    Examples:
      | bottomsSubcategory |  loginStatus   |
      | Pants              |  loggin in     |
      | Shorts             |  loggin in     |
      | Pants              |  non-logged in |
      | Shorts             |  non-logged in |

  Scenario: User is successful redirect to Luma's Performance Fabric collection
    When  user clicks on the "Luma's Performance Fabric collection" banner
    Then  user is redirected to the collection page
    And   all products from "Performance Fabric collection" should be displayed

  Scenario: User is successful redirect to Men Tees products
    When  the user scrolls down until they see banner with text "Byt 3 Luma tees, get 4 instead"
    And   user clicks on the tees banner
    Then  user is redirected to the "Men Tees" products
    And   all men tees products should be displayed

  Scenario: User is successful redirect to Men Pants products
    When  the user scrolls down until they see banner with text "Last chance for pants"
    When  user clicks on the "pants" banner
    Then  user is redirected to the "Men Pants" products
    And   all men pants products should be displayed

  Scenario: User is successful redirect to Luma Men shorts products
    When  the user scrolls down until they see banner with text "Luma shorts"
    When  user clicks on the "Luma shorts" banner
    Then  user is redirected to the "Men Shorts" products
    And   all men shorts products should be displayed

  Scenario: User is successful redirect to Luma Men Tees products
    When  the user scrolls down until they see banner with text "Luma tees"
    When  user clicks on the "Luma tees" banner
    Then  user is redirected to the "Men Tees" products
    And   all men tees products should be displayed

  Scenario: User is successful redirect to Luma Men hoodies products
    When  the user scrolls down until they see banner with text "Luma hoodies"
    When  user clicks on the "Luma hoodies" banner
    Then  user is redirected to the "Men hoodies" products
    And   all men hoodies  products should be displayed

  Scenario: Verify Favourites products are shown on bottom of page
    When  user scrolls down until see text "Hot Sellers"
    Then  four "Favourites products" should be displayed under title "Hot Sellers"