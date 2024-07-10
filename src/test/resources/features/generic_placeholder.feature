Feature: Generic Placeholder Example
  Scenario: Using {} as a placeholder
    Given the item is apple
    And the price is 1.99
    And the quantity is 5
    Then I should see the item, price, and quantity
