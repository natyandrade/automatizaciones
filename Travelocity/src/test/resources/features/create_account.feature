#Author: natyandrade@gmail.com

Feature: create an account Travelocity
  As a web user
  A want to create an account
  To using the application

   Scenario: create account
    Given that Naty wants into travelocity page
    When she create an account with the correct data 
    |firstName	|lastName	|email                  |password       |confirmPassword    |
    |Natali 		|Andrade	|natyandrade@gmail.com  |natyandrade2021|natyandrade2021    |
    Then she should see her name on the front page