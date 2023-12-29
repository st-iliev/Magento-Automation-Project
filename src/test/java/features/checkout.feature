Feature:  Checkout functionality
  Background:
    Given the user is logged in
    And   he user has products in their cart
    And   the user is on the checkout  page

  Scenario: Verify shipping address information
    When   the user views checkout page
    And    the user's shipping information should be displayed
    And    all products in user's cart should be displayed

  Scenario: New address functionality
    When   the user clicks on the "+ New Address" button
    Then   the shipping address form should be displayed
    And    the user fills the following information:
           | Field           | Value          |
           | First Name      | "Keen"         |
           | Last Name       | "Theron"       |
           | Street Address  | "Summer str"   |
           | City            | "Sacramento"   |
           | State/Province  | "California"   |
           | Zip/Postal Code | "2653"         |
           | Country         | "USA"          |
           | Phone Number    | "310-365-8062" |
    And   clicks on the checkbox "Save in address book"
    And   clicks on the "Ship here" button
    And   the new shipping address information should be displayed in "Shipping Address" marked with a ticket

  Scenario: Choosing shipping address functionality
    Given the user has more than one shipping address
    When  the user clicks on the "Ship Here" button in the second shipping address information
    Then  "Ship Here" button disappears
    And   the second shipping address information should be marked with a ticket

  Scenario: Edit shipping address functionality
    Given the user has more than one shipping address
    When  the user clicks on the "Edit" link in the second shipping address information
    Then  the form with shipping address fields should be displayed
    And   the user fills the following information:
          | Field           | Value            |
          | First Name      | "Dean"           |
          | Last Name       | "Hof"            |
          | Street Address  | "Longway str"    |
          | City            | "Charleston"     |
          | State/Province  | "South Carolina" |
          | Zip/Postal Code | "5485"           |
          | Country         | "USA"            |
          | Phone Number    | "450-958-1478"   |
    And   clicks on the checkbox "Save in address book"
    And   clicks on the "Ship here" button
    And   modified  shipping address information should be displayed  in "Shipping Address" and marked with ticket

  Scenario: Verify payment method
    Given the user has chosen a shipping address and method
    When  the user clicks on the "Next" button
    Then  the "Payment Method" should be displayed
    And   the billing and shipping addresses should be displayed

  Scenario: Verify order summary information
    Given the user is on the payment method
    Then  cart subtotal, shipping and order total prices should be displayed on the right side
    And   all products in user's cart should be displayed under order total price

  Scenario: Verify ship to information
    Given the user is on the payment method
    When  the user scrolls down until they see the text "Ship To:" title on the right side
    Then  the shipping address information should be displayed under the "Ship To:" text.

  Scenario: Verify shipping method information
    Given the user is on the payment method
    When  the user scrolls down until they see the text "Shipping Method:" title on the right side
    Then  the shipping method information should be displayed under the "Shipping Method:" text

  Scenario: Verify discount code
    Given the user is on the payment method
    When  he user clicks on the "Apply Discount Code" link
    Then  the discount code field with "Apply Discount" button should be displayed

  Scenario: Place order functionality
    Given the user is on the payment method
    When  the user clicks on the "Place Order" button
    Then  the user's order should be complete
    And   a message "Thank you for your purchase!" should be displayed

  Scenario: Verify print receipt functionality
    Given the user has finished their order
    When  the user clicks on the "Print recept" link
    Then  the user is redirected to page with the order number and status as a title
    And   order information should be displayed in a table with following columns:
          | Product Name | SKU | Price | Qty | Subtotal|
    """
    Subtotal
    Shipping & Handling
    Grand Total
    """
  Scenario: Verify continue shopping button functionality
    Given the user has finished his order
    When  the user clicks on the "Continue Shipping" button
    Then  the user is redirected to the home page