Feature:Cash withdrawal
  Scenario:Successful withdrawal from an account in credit
    Given I have $100 in my account
    When I request $20
    Then $20 should be dispensed

  Scenario:Successful withdrawal from an account in credit
    Given I have $250 in my account
    When I have request $20
    Then $20 should be dispensed














