Feature: My Account

  Background:
    Given the user is logged in
    And   the user is on the my account page


  Scenario: Use is redirect to "My Orders"
    When  the user clicks on "My Orders" in the sidebar
    Then  the user should be redirected to the "My Orders" page
    And   orders should be displayed in a table with the follwing columns:
          | Order # | Date | Ship To | Order Total | Status | Action |

  Scenario: User redirect to "My Downloadable Products"
    When  the user clicks on "My Downloadable Products" in the sidebar
    Then  the user should be redirected to the "My Downloadable Products" page
    And   page title "My Downloadable Products" should be displayed

  Scenario: Use is redirect to "My Wish List"
    Given the user has products in their wishlist
    When  the user clicks on "My Wish List" in the sidebar
    Then  the user should be redirected to the "My Wish List" page
    And   all products in their wishlist should be displayed

  Scenario: User redirect to "Address Book"
    When  the user clicks on "Address Book" in the sidebar
    Then  the user should be redirected to the "Address" page
    And   default billing, shipping and additional adressess should be displayed

  Scenario: User redirect to "Account Information"
    When  the user clicks on "Account Information" in the sidebar
    Then  the user should be redirected to the "Account Information" page
    And   account information about firstname and lastname should displayed
    And   the user should be able to edit their first and last name

  Scenario: User redirect to "Stored Payment Methods"
    When  the user clicks on "Stored Payment Methods" in the sidebar
    Then  the user should be redirected to the "Stored Payment Methods" page
    And   an message "You have no stored payment methods." should be displayed

  Scenario: User redirect to "My Product Reviews"
    When  the user clicks on "My Product Reviews" in the sidebar
    Then  the user should be redirected to the "My Product Reviews" page
    And   reviews should be displayed in a table with the follwing columns:
          | Created | Product Name | Rating | Review | See Details |

  Scenario: Verify contact information
    Given the user's contact information is stored as follows:
          | firstName | lastName | emailAddress          |
          | Ron       | Vezov    | justfortest777@abv.bg |
    When  the user views the contact information
    Then  the contact information including first name, last name, and email address should be displayed:
          """
          firstName lastName
          emailAddress
          """
  Scenario: Verify edit account information functionality
    When  the user clicks on the "Edit" link in the Contact Information
    Then  the user should be redirected to the "Edit Account Information" page
    And   the user should be able to modify fist name and last name

  Scenario: Verify change password functionality
    When  the user clicks on the "Change Password" link in the Contact Information
    Then  the user should be redirected to the "Edit Account Information" page
    And   the user should be able to modify fist name, last name and password

  Scenario: Verify manage addresses functionality
    Given the user's default billing and shipping address is stored as follows:
          | firstName | lastName | streetAddress | city    | zipCode | country  | phoneNumber    |
          | Ron       | Vezov    | Hunting str   | Bornemu | 1597523 | Bulgaria | (335) 984-5713 |
    When  the user clicks on the "Manage Addresses" link in the Address Book
    Then  the user should be redirected to the "Address" page
    And   default billing, shipping and additional adressess should be displayed
          """
          firstName lastName
          streetAddress
          city, zipCode
          country
          T: phoneNumber
          """
  Scenario Outline: Verify edit address functionality
    When  the user click on the "Edit Address" link in the Default "<address>" Address
    Then  the user is redirected to the "Edit Address" page
    And   contact information and address should be displayed
    And   the user should be able to modify their contact and address information

    Examples:
      | address  |
      | Billing  |
      | Shipping |

  Scenario: Verify my recent reviews
    Given the user has recent reviews
    And   recent reviews is stored as follows:
          | productName| rating |
    When  the user views recent reviews
    And   products with user's review should be displayed:
    """
    productName
    Rating: rating
    """

  Scenario: Verify view all my recent reviews functionality
    When  the user clicks on the "View All" in the My Recent Reviews
    Then  the user should be redirected to the "My Product Reviews" page
    And   reviews should be displayed in a table with the follwing columns:
          | Created | Product Name | Rating | Review | See Details |

  Scenario: Verify recent orders
    Given the user has recent orders
    When  the user views recent orders
    Then  orders should be displayed in a table with the follwing columns:
          | Order # | Date | Ship To | Order Total | Status | Action |

