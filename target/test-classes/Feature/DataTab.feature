Feature: Validating the Amazon login page

Scenario: Validating with the valid credentials

Given User is on the login page1
When User enters the username and password
| username |  password  |
|abc123@gmail.com|abc345|
|xyz@gmail.com | xyz123 |
And User clicks the login button1
Then User is on the home page1