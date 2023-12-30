Feature: Gear page

  Background:
    Given the user is on gear page

  Scenario Outline:  User is redirect to the selected gear's subcategory
    Given the user is <loginStatus>
    When  user clicks on the "<gearsSubcategory>" on left side bar
    Then  user should be redirect on Men "<gearsSubcategory>" page
    And   all products from this category should be displayed
    Examples:
      | gearsSubcategory  | loginStatus   |
      | Bags              | loggin in     |
      | Fitness Equipment | loggin in     |
      | Watches           | loggin in     |
      | Bags              | non-logged in |
      | Fitness Equipment | non-logged in |
      | Watches           | non-logged in |

  Scenario: User is successful redirect to Yoga Companion Kit products
    When  user clicks on the "Sprite Yoga companion Kit" banner
    Then  user is redirected to the collection page
    And   all products from "Yoga Companion Kit" should be displayed

  Scenario: User is successful redirect to Fitness Equipment products
    When  the user scrolls down until they see banner with text "Loosen Up"
    And   user clicks on the fitness banner
    Then  user is redirected to the "Fitness Equipment" products
    And   all fitness equipment products should be displayed

  Scenario: User is successful redirect to Men Pants products
    When  the user scrolls down until they see banner with text "Last chance for pants"
    When  user clicks on the "pants" banner
    Then  user is redirected to the "Men Pants" products
    And   all men pants products should be displayed

  Scenario: User is successful redirect to Luma water bottle products
    When  the user scrolls down until they see banner with text "Here's to you!"
    When  user clicks on the "Luma water bottle" banner
    Then  user is redirected to the "Water bottle" products
    And   all water bottle products should be displayed

  Scenario: User is successful redirect to Bags products
    When  the user scrolls down until they see banner with text "Tote, cart or carry"
    When  user clicks on the "bags" banner
    Then  user is redirected to the "Bags" products
    And   all bags products should be displayed

  Scenario: User is successful redirect to Fitness Equipment products
    When  the user scrolls down until they see banner with text "let's get after it!"
    When  user clicks on the "Luma gym" banner
    Then  user is redirected to the "Fitness Equipment" products
    And   all fitness equipment  products should be displayed

  Scenario: User is successful redirect to Watches products
    When  the user scrolls down until they see banner with text "Luma watches"
    When  user clicks on the "Luma watches" banner
    Then  user is redirected to the "Watches" products
    And   all watches products should be displayed

  Scenario: Verify Favourites products are shown on bottom of page
    When  user scrolls down until see text "Hot Sellers"
    Then  four "Favourites products" should be displayed under title "Hot Sellers"