Feature: Heal Log IN Feature
@sanity @chrome
Scenario Outline: Verify User Login with Valid Credentials
Given User in on the healthfirst homepage
When I click on login 
And I click on member portal from the dropdown menu
Then I enter valid <User Name>
And I enter valid <Password>
Then I click login button
And i click on skip for now
Then i click no thanks
Examples:
| User Name   | Password    |
| nikitanarula| 17August@2023 |