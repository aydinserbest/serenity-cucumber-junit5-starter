Feature: Vehicle Description Verification

  Scenario: Verify vehicle matches the given description
    Given the vehicle consists of:
      | Wheels      | 2                       |
      | Max Speed   | 60 mph                  |
      | Accessories | lights, shopping basket |
    Then I should see a vehicle that matches the following description:
      | Wheels | Max Speed | Accessories             |
      | 2      | 60 mph    | lights, shopping basket |
