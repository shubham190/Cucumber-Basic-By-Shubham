Feature: user Registration form

Scenario: user Registraion with diff data
Given user is on registration page
When user enter following user details

 | Tom | Parker | shubham19@gmail.com | 8461883654 |
 
 | ajay | Parker | ajay@gmail.com | 8461883561 |
 
 Then user registraion sucessfully
 
 Scenario: user registration with diff data having columns
 Given user is on registration page
When user enter following user details having columns

 | sakshi | Parker | sakshi@gmail.com | 9535351394 |
 
 | shubham | Parker | shubham@gmail.com | 9826581145 |
 
  Then user registraion sucessfully
 
 
 
 
 


