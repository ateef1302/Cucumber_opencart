Feature: Cart Feature

  Scenario: Add Imac product to cart
    Given Search Imac product
    When click on the search button
    And Add the product to cart
    And Go to the cart
    Then Checkout product
