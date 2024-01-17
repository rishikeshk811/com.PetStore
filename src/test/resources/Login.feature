Feature: Login 


@regression @smoke
Scenario: Verification of Login Function  
Given user on the Login Page
And user enters "Nickname" with "arprankmaster2020@gmail.com" 
And user enters "password" with "password@123"  
And user click "log in" button
Then user should see their Nickname "Mukeshkumar" on HomePage

Scenario: Unsuccessful login with invalid Nickname and Valid password
Given user on the Login Page
And user enters "email address" with "arprankmaster@gmail.com" 
And user enters "password" with "password@123"  
And user clicks "login" button
Then error message displayed with "Incorrect nickname/password combination"

Scenario: Unsuccessful login with valid Nickname and Invalid password
Given user on the Login Page
And user enters "email address" with "arprankmaster2020@gmail.com" 
And user enters "password" with "passwo@123"  
And user clicks "login" button
Then error message displayed with "Incorrect nickname/password combination"