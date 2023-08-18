Feature: Create an account without Creating Member Id
This Feature is to see if User can create an account without having a member ID

Scenario Outline: Verify User can create an Account without having a member ID
Given User is on HealthFirst Home page
When User clicks on Login
And User clicks on member portal from dropdown menu
And User enters user name
And User enters Username <"username">
And User enter password <"password">
And User clicks Login
Then User clicks on skip for now
Then User clicks no thanks

Examples:
|username     |  password |
|17August@2023|Success2023|