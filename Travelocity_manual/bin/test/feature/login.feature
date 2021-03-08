#Author: natyandrade@gmail.com
 
@manual
  Feature: login Travelocity
  	As a web user
  	A want to login to travelocity
    To using the travelocity website

@manual1
Scenario: sign in travelocity with correct credentials
    Given that Naty wants into travelocity page home
    When she enter the correct credentials with user "natyandrade@gmail.com" and password "natyandrade2021"
    Then she should login in to travelocity home page

@manual2
  Scenario: sign in travelocity with incorrect user
    Given that Naty wants into travelocity page
    When she enter the incorrect user with user "natyandradea@gmail.com" and password "natyandrade2021"
    Then she should not sign in travelocity home page

@manual3
  Scenario: sign in travelocity with incorrect password
    Given that Naty wants into travelocity page
    When she enter the incorrect password with user "natyandradea@gmail.com" and password "natyandrade2011"
    Then she should see load in to travelocity home page