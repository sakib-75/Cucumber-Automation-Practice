Feature: Place an order

  Background: Add product to cart
    Given user is on home page
    When add few products to cart
    Then verify selected product added to cart

  Scenario Outline: Enter wrong promo code
    Given user is on place order page
    When <promo code> is added
    Then verify promo code alert message
    Examples:
      | promo code         |
      |                    |
      | abc xyz            |
      | rahulshettyacademy |
