Feature: Shopping List Management

  Scenario: Verify items in the shopping list
    Then my shopping list should contain:
      | Onions   |
      | Potatoes |
      | Sausages |
      | Apples   |
      | Relish   |

# yukaridan asagi, basliksiz, 1 list var, asList() olur