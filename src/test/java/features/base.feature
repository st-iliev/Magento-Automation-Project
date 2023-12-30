Feature:  Base page

  Scenario: User logs out successfully
    Given the user is logged in
    When  the user clicks on the "customerMenuButton"
    And   the user clicks on the "Sign Out" button
    Then  message "You are signed out" is appear to the user
    And   the user is redirecred the Home page
    And   "Sign In or Create an Account" should be visible

  Scenario Outline: Compare products verification
    Given the the user is "<loginStatus>"
    When  the user scrolls down until they see text "Compare Products" on left side bar
    Then  all compares products should be displayed under the text "Compare Products"
    Examples:
      | loginStatus   |
      | logged in     |
      | non-logged in |

  Scenario: Verify Compare products functionality
    Given the user is logged in
    When  the user scrolls down until they see text "Compare Products" on left side bar
    And   all compares products should be displayed under the text "Compare Products"
    Then  click on "Compare" button
    And   the user should be redirect to product compare page
    And   description for all compare products should be displayed


  Scenario: Remove one compare product
    Given the user is logged in
    When  the user scrolls down until they see text "Compare Products" on left side bar
    And   all compares products should be displayed under the text "Compare Products"
    Then  click on cross symbol on right side of compare product
    And   click on "OK" button
    And   compar product should be removed from "Compare Products"

  Scenario: Remove all compare product
    Given the user is logged in
    When  the user scrolls down until they see text "Compare Products" on left side bar
    And   all compares products should be displayed under the text "Compare Products"
    Then  click on "Clear All" link
    And   click on "OK" button
    And   all compar products should be removed from "Compare Products"

  Scenario Outline: Missing products in "Compare Products"
    Given the the user is "<loginStatus>"
    When  the user scrolls down until they see text "Compare Products" on left side bar
    Then  text "You have no items to compare." should be displayed under text "Compare Products"
    Examples:
      | loginStatus   |
      | logged in     |
      | non-logged in |

  Scenario: Verify "My Wish List" functionality
    Given the user is logged in
    When  the user scrolls down until they see text "My Wish List" on left side bar
    Then  click on "Go to Wish List"
    And   the user should be redirect to wishlist page
    And   all products in wishlist should be displayed

  Scenario: Remove one product from "My Wish List"
    Given the user is logged in
    And   the user has products in their wishlist
    When  the user scrolls down until they see the text "My Wish List" on the left sidebar
    Then  click on "cross" symbol on right side of first product in "My Wish List"
    And   a successful message "Leah Yoga Top has been removed from your Wish List." should be displayed
    And   the product should be removed from "My Wish List"

  Scenario Outline: Missing products in "My Wish List"
    Given the the user is "<loginStatus>"
    When  the user scrolls down until they see text "My Wish List" on left side bar
    Then  all compares products should be displayed under the text "Compare Products"
    Examples:
      | loginStatus   |
      | logged in     |
      | non-logged in |

  Scenario Outline: Verify search functionality with invalid data
    When  the user clicks on the "Search" field
    And   fills "<invalidData>" in "Search" field
    Then  the user clicks on the "magnifying glass"
    And   an message "Your search returned no results." should be displayed
    And   no products should be displayed

    Examples:
      | invalidData |
      | truck       |
      | men         |
      | gloves      |

  Scenario Outline: Verify search functionality with valid data
    When  the user clicks on the "Search" field
    And   fills "<validData>" in "Search" field
    Then  the user clicks on the "magnifying glass"
    And   products matching the search term should be displayed

    Examples:
      | validData  |
      | jacket     |
      | hat        |
      | gloves     |

  Scenario:  Empty cart functionality
    Given the user is logged in
    And   the user has no products in their cart
    When  the user clicks on the "Cart" icon
    Then  a popup window with the message "You have no items in your shopping cart." should be displayed

  Scenario:  Non-empty cart functionality
    Given the user is logged in
    And   the user has products in their cart
    When  the user clicks on the "Cart" icon
    Then  a popup window should be displayed with the number of items, cart subtotal price, and "Proceed to Checkout"button
    And   products information: product name, price, quantity for each product, should be displayed
    And   a "View and Edit Cart" link should be displayed

  Scenario Outline: User is redirected to selected women's subcategory from navigation bar
    When  the user hoover on "Women"
    Then  the user clicks on "<womensSubCategory>"
    And   the user is redirected to the selected "<womensSubCategory>"
    And   product from the selected category should be displayed

    Examples:
      | womensSubCategory |
      | Tops              |
      | Bottoms           |

  Scenario Outline: User is redirected to selected women's subsubcategory from navigation bar
    When  the user hoover on "Women"
    And   the user hoover on "<womensSubcategory>"
    Then  the user clicks on "<womensSubSubCategory>"
    And   the user is redirected to the selected "<womensSubSubCategory>"
    And   product from the selected category should be displayed

    Examples:
      | womensSubcategory | womensSubSubCategory  |
      | Tops              | Hoodies & Sweatshirts |
      | Tops              | Jackets               |
      | Tops              | Tees                  |
      | Tops              | Bras & Tanks          |
      | Bottoms           | Pants                 |
      | Bottoms           | Shorts                |

  Scenario Outline: User is redirected to selected men's subcategory from navigation bar
    When  the user hoover on "Men"
    Then  the user clicks on "<mensSubCategory>"
    And   the user is redirected to the selected "<mensSubCategory>"
    And   product from the selected category should be displayed

    Examples:
      | mensSubCategory   |
      | Tops              |
      | Bottoms           |

  Scenario Outline: User is redirected to selected men's subsubcategory from navigation bar
    When  the user hoover on "Men"
    And   the user hoover on "<mensSubcategory>"
    Then  the user clicks on "<mensSubSubCategory>"
    And   the user is redirected to the selected "<mensSubSubCategory>"
    And   product from the selected category should be displayed

    Examples:
      | mensSubcategory   | mensSubSubCategory
      | Tops              | Jackets               |
      | Tops              | Hoodies & Sweatshirts |
      | Tops              | Tees                  |
      | Tops              | Tanks                 |
      | Bottoms           | Pants                 |
      | Bottoms           | Shorts                |

  Scenario Outline: User is redirected to selected gear's subcategory from navigation bar
    When  the user hoover on "Gear"
    Then  the user clicks on "<gearsSubCategory>"
    And   the user is redirected to the selected "<gearsSubCategory>"
    And   product from the selected category should be displayed

    Examples:
      | gearsSubCategory   |
      | Bags               |
      | Fitness Equipment  |
      | Watches            |



