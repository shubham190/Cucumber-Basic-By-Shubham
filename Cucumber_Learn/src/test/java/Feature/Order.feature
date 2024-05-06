Feature: Amazon order
##Background keyword is used to define some pre-conditions for all the scenarios.

Background:

Given A registered user exists
Given user is on amazon page
When enter username
And enter password
And click on sign in button
Then when user navigate to order page


Scenario: Check previous order detail

When user click on order link
Then user check the previous order detail

Scenario: check open order detail

When user click on order link
Then user check the order detail 

Scenario: User check the cancelled order detail

When user click on cancelled order link
Then user check the cancelled order detail

