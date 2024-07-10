Feature: Cash Withdrawal
### TODO: # lar, keywoard sonunda yazilabiliyor mu
Scenario: Successful withdrawal from an account in credit
Given I have $100 in my account # the context
When I request $20 # the event(s)
Then $20 should be dispensed # the outcome(s)

Scenario: Attempt withdrawal using stolen card
Given I have $100 in my account
But my card is invalid
When I request $50
Then my card should not be returned
And I should be told to contact the bank

    #Cucumber doesn’t actually care which of these keywords you use;
    # the choice is simply there to help you create the most readable scenario.
    # If you don’t want to use And or But , you could write the previous scenario like this,
    # and it would still work exactly the same way:
    #
    ##

Scenario: Attempt withdrawal using stolen card
Given I have $100 in my account
Given my card is invalid
When I request $50
Then my card should not be returned
Then I should be told to contact the bank

    #Some people find Given , When , Then , And , and But a little verbose.
    # There is an additional keyword you can use to start a step: * (an asterisk).
    # We could have written the previous scenario like this:
    #
    # To Cucumber, this is exactly the same scenario.
    #

Scenario: Attempt withdrawal using stolen card
* I have $100 in my account
* my card is invalid
* I request $50
* my card should not be returned
* I should be told to contact the bank