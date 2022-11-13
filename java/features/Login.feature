Feature: LT-65123 Leaftaps Login story

Background:
Given Open the chrome browser - maximize and set the timeout
And Load the application url "http://leaftaps.com/opentaps"

@Smoke @Regression
Scenario Outline: TC001 - Verify the login with valid credentials
Given Enter username as <username>
And Enter password as <password>
When Login button is clicked
Then verify the user logged-in successfully
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@Sanity
Scenario: TC002 - Verify the login with invalid credentials
Given Enter username as "Demosalesmanager"
When Login button is clicked
But Verify the error message displayed

@Sanity @Smoke
Scenario: TC003 - Verify the login with invalid credentials
Given Enter username as "Test123"
And Enter password as "crmsfa"
When Login button is clicked
But Verify the error message displayed

