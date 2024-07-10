Feature: Cucumber Count in Belly and Stomach
  In order to keep track of cucumbers in my belly and stomach
  As a person
  I want to see the correct number of cucumbers when I add more

  Scenario: Adding a cucumber to existing cucumbers in belly
    Given I have 42 cucumbers in my belly
    And I have 1 cucumber in my stomach
    When I add 1 more cucumber to my belly
    Then I should have 44 cucumbers in my body

    # I have {int} cucumber(s) in my belly
    #    alternative text
    #  I have {int} cucumber(s) in my belly/stomach