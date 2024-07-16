Feature: GitHub login feature
This feature helps user to log in to their GitHub account.

Scenario: User wants to log in to GitHub
    Given User should open GitHub login page
    When User enters their username and password
    And clicks on the submit button
    Then User should be redirected to their GitHub dashboard
