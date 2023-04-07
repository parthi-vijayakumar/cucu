Feature: to Test guru99  #goal
1)valid case
2)invalid case
Background:
Given open the browser and navigate to the login page 
@PositiveTesting
Scenario: To test the login functionality with valid
When Enter the username "user"
And Enter the password "user"
And Click on login
Then Ishould see the title as :login successfully  #outcome
@NegativeTesting
Scenario: To test the login functionality with invalid
When Enter the username "users"
And Enter the password "user456"
And Click on login
Then Ishould see the title as :login successfully