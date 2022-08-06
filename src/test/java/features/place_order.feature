Feature: Place an order

  Scenario: Add product to cart
    Given user is on home page
    When add few products to cart
    Then verify selected product added to cart