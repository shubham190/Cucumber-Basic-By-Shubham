@Everyting
Feature: SignUP Feature

@smoke
Scenario: User Registration Sign up

Given Enter the user registration form
When Enter the username and password
Then Enter the email id and phone number
Then Click on sign up button

@smoke @Regression
Scenario: Invalid user Registration sign up

Given Enter the user registration form
When Enter the username and password
Then Enter the email id and phone number
Then Click on sign up button

@Integration
Scenario: Enter the Registered Username in the sign up
Given Enter the user registration form
When Enter the username and password
Then Enter the email id and phone number
Then Click on sign up button
