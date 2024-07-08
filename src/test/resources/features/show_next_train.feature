#This feature is really important for the Marketing team


Feature: Earning Frequent Flyer points from flights

  Scenario: Flights within Europe earn 100 points
    Given Tara is a Frequent Flyer traveler
    When she completes a flight between Paris and Berlin
    Then she should earn 100 points


