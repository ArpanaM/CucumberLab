Feature: Login Action
Scenario: Verify Login for Valid inputs and display as Login Successful.
Given user is on homepage
When user clicks on Signin Link
Then check Title
When user enters username and password clicks on submit button
Then validate the user and display Login Successful if user is valid
 
Scenario: Verify Login for InValid inputs and display error message.
Given user is on homepage
When user clicks on Signin Link
Then check Title
When user enters invalid username or password clicks on submit button
Then Check for the error message
 