Feature: Credit Completed Flights

  Scenario: Completed flights in the past 90 days can be claimed
    Given Todd joined the Frequent Flyer program on 2020-01-01
    When Todd asks for the following flight to be credited to his account:
      | Flight Number | Date       | Status    |
      | FH-101        | 2019-12-01 | COMPLETED |
      | FH-102        | 2019-12-01 | CANCELED  |
      | FH-103        | 2019-08-01 | COMPLETED |
    Then only the following flights should be credited:
      | Flight Number | Date       | Status    |
      | FH-101        | 2019-12-01 | COMPLETED |

