@flip
Feature: Test Search functionality

  Scenario Outline: search some product
#    Given User opens flipkart in firefox
    When when user searches for <mobileName>
    Then User should get that product in search results
    And User can select that product
    And User can add product to cart
    Examples:
      | mobileName   |
      | redmi note 4 |


