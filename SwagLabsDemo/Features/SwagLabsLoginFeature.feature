Feature: Login feature
Login feature allow user to login into corresponding Swag Labs account


Scenario: User is trying access Swag Labs account using invalid credentials
Given User is on Swag Labs login page
When User enter wrong credentials
|username | password |
|wrongUsername | wrongPassword|
And click on login
Then 'Epic sadface: Username and password do not match any user in this service' message should display

Scenario: User is trying access Swag Labs account using valid credentials
Given User is on Swag Labs login page
When User enter valid credentials
|username | password |
|standard_user | secret_sauce|
And click on submit
Then user able to login to Swag Labs home page.