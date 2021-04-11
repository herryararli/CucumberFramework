Feature: First Feature
  Scenario Outline: We are checking cucumber keywords
    Given This is Given <numbers>
    When This is "<Strings>"
    Then This is Then
    Examples:
    |numbers|Strings|
    |   5   |Haluk  |
    |   5   |Haluk   |

