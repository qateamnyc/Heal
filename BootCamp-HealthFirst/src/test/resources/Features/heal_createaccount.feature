Feature: Heal Account Creation Feature
@sanity @chrome
Scenario Outline: User should be able to create an account without a id number
Given User in on the healthfirst homepage
When I click on login button
And I click on member portal from the dropdown menu
Then I click on create account
And I select and choose I need to activate my coverage
Then I click on continue
And i enter first name <name>
Then i enter date of birth <DOB>
And i enter mobile phone number <mobile number>
And i enter email adress <nikita@gmail.com>
And i reenter email address to confirm <nikita@gmail.com>
Then i click checkbox I acknowledge the term of use
Then i click on send code button
Examples:
| name   | DOB    | mobile number|email address|
| nikita| 0820 | 9174567869| nikita@gmail.com|