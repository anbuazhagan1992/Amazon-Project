Feature: Login functionality

@smoketesting
Scenario: Validate with the valid credentials

Given User is on the login page
When  User enters the valid name and password
And   User clicks the login button
Then  User is on the home page 

@smoketesting
Scenario: Validate with the invalid credentials

Given User is on the login page
When  User enters the invalid name and invalid password
And   User clicks the login button
Then  User is on the home page 

@sanitytesting
Scenario: Validate with the one invalid credentials

Given User is on the login page
When  User enters the invalid name and valid password
And   User clicks the login button
Then  User is on the home page 

@regressiontesting
Scenario: Validate with the valid one credential

Given User is on the login page
When  User enters the valid name and invalid password
And   User clicks the login button
Then  User is on the home page 
