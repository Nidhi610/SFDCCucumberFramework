Feature: Sales Force TestCases Login Feature


Scenario: Verify Login error with Valid Username and Empty Password field
Given User login page is launched
 When Enter "<username>"
 When clear "<password>"
 And login button is clicked
 Then Error msg Displayed on login page
 
Examples:
| username            | password |
|nidhi4179@google.com |          |



Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>" 
 And Clicks on Forget password link
 Then Forget password page should be display
    
Examples:
| username            | password |
|nidhi4179@google.com |          |




Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>" and valid  "<password>"
 And Clicks on Login button
 Then Home page should be display
    
Examples:
| username            | password |
|nidhi4179@google.com | Nidhi@417 |



Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>" and valid  "<password>"
 When Check Remember me checkbox
 And Clicks on Login button
 Then Home page should be display
    
Examples:
| username            | password |
|nidhi4179@google.com | Nidhi@417 |




Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>" and valid  "<password>"
 When Clicks on Login button
 When Home page should be display
 When Click on User Menu
 And Click Logout
 Then Should be logout
    
Examples:
| username            | password |
|nidhi4179@google.com | Nidhi@417 |
