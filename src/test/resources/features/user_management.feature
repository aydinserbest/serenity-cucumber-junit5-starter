Feature: User Management

  Scenario: Add users to the system
    Given these Users:
      | name            | date of birth   |
      | Michael Jackson | August 29, 1958 |
      | Elvis           | January 8, 1935 |
      | John Lennon     | October 9, 1940 |

    # key-value var, 1 den fazla map var, asMaps() olur
    #