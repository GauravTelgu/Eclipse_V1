Feature: Google search translation feature
This feature helps user to search an translate a word from one language to another using google search.

Scenario Outline: User wants to translate word from one language to another language
Given User should open Google translater page
When User entered "<Word>" word into "<From>" language and select "<To>" language
Then Google translater should display word "<Word>" into "<To>" language

Examples:
| Word       | From    | To      |
| Abstraction| English | Marathi |
| Fire       | English | French  |
| Happy      | English | Marathi |
| Sad        | English | Marathi |
