Feature: Login Page Test
  Scenario: Login with correct credentials
    Given User will be on Login Page
    When User enter correct username and password and click login
    Then Verify Login
