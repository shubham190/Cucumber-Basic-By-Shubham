Feature: Bankinglogin
Scenario Outline: Unsucessful login- Possible combination

Given user is on AUT page
When user click on sign in page
Then login screen is displayed to the user
When user enters "<username>" in username field
And user enters "<password>" in password field
And user click on sign in button
Then user get login failed error message

 Examples:
   |username        | password       | 
   |invalidusername | 9865           |
   |satyam          |invalid password|
   
 
 


