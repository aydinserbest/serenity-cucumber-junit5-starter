Feature: Checkout

  Scenario: Checkout a banana
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    Then the total price should be 40c

  Scenario: Two bananas scanned separately
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    And I checkout 1 "banana"
    Then the total price should be 80c

  Scenario: A banana and an apple
    Given the price of a "banana" is 40c
    And the price of a "apple" is 25c
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then the total price should be 65c

  Scenario Outline: Checkout items
    Given the price of a "<item>" is <amount>c
    When I checkout <count> "<item>"
    Then the total price should be <totalAmount>c
    Examples:
      | item   | amount | count | totalAmount |
      | banana | 40     | 1     | 40          |
      | apple  | 25     | 3     | 75          |
      | kiwi   | 30     | 2     | 60          |

