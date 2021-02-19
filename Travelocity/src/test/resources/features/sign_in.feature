Feature: sign in Travelocity
  As a web user
  A want to sign in to travelocity
  To using the application

   Scenario: sign in travelocity with correct credentials
    Given that Naty wants into travelocity page home
    When she enter the correct credentials
    |user										|password					|
    |natyandrade@gmail.com	|natyandrade2021	|
    Then she should login in to travelocity home page
