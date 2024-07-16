Feature: Google search feature
This feature helps user to search an appropriate information using google search engin.

Scenario: User want to search an information on given topic
    Given User should open Google search page
    When User entered "Agile Methodology" in search box
    And click on submit button
    Then Multiple Links should be displayed on "Agile Methodology" topic



Scenario: User should be able to search distance between two cities
Given User should open Google search page
When User entered cities name "Pune Mumbai Distance" in search box
And click on submit button
Then map should be display between "Pune and Mumbai" cities along with distance in KM