Feature: Water Measurement
  Scenario: Measure water in different containers
    Given I have 3.14 liters of water in my bottle
    And I have 1.5 liters of water in my container
    Then I should know the total amount of water
