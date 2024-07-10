Feature: Color Descriptions
  Scenario: Using {word} and {string} in step definitions
    Given the color is red
    And the description is "A bright and vibrant color"
    Then I should see the color and the description
