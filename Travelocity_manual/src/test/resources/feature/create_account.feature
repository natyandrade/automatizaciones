#Author: natyandrade@gmail.com

@manual
Feature: create an account Travelocity
  As a web user
  A want to create an account
  To using the travelocity website

@manual1
   Scenario: create account with blank fields
    Given that Naty wants into travelocity page
    When she create an account with blank fields 
    |firstName	|lastName	|email  |password |confirmPassword |
    |        		|       	|       |         |                |
    Then she should not see her name on the front page

@manual2
    Scenario: create account with correct data
    Given that Naty wants into travelocity page
    When she create an account with the correct data 
    |firstName	|lastName	|email                  |password       |confirmPassword    |
    |Natali 	|Andrade	|natyandrade@gmail.com  |natyandrade2021|natyandrade2021    |
    Then she should see her name on the front page