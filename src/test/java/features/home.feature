Feature:  Home page
  Background:
    Given  the user is on the home page

  Scenario: User is successful redirect to New Luma Yoga Collection
    When the user clicks on the "New Luma Yoga Collection" banner
    Then the user is redirected to the collection page
    And  all products from "New Luma Yoga Collection" should be displayed

  Scenario: User is successful redirect to pants products
    When the user clicks on the pants banner
    Then the user is redirected to the pants products page
    And  all pants products should be displayed

  Scenario: User is successful redirect to Tees products
    When the user clicks on the tees banner
    Then the user is redirected to the Tees products
    And  all tees products should be displayed

  Scenario: User is successful redirect to Erin recommended products
    When the user clicks on the erin banner
    Then the user is redirected to the "Erin Recommends" products
    And  all eric recomended products should be displayed

  Scenario: User is successful redirect to Performance products collection
    When the user clicks on the performance banner
    Then the user is redirected to the "Performance Fabrics" products
    And  all products from performance collection should be displayed

  Scenario: User is successful redirect to Eco Friendly collection
    When the user clicks on the eco banner
    Then the user is redirected to the "Eco Friendly" products
    And  all "Eco-Friendly" products should be displayed

  Scenario: Verify Luma's trending products are shown on bottom of page
    When the user scrolls down until see text "Hot Sellers"
    Then all "Luma's trending products" should be displayed under text "Hot Sellers"


  Scenario: Verify copyright text on bottom of page
    When user scrolls to the bottom of the page
    Then copyright text "Copyright © 2013-present Magento, Inc. All rights reserved."should be visible
