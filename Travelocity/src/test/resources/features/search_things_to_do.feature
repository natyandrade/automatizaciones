#Author: natyandrade@gmail.com

Feature: things to do in a destination
  As a web user
  A want select the option things to do
  To using the travelocity website

Background:
    Given that Naty wants into travelocity website

  Scenario: search things to do in a destination
    When search for things to do in a destination and dates
    |in			|from					|to						|
    |Cancun	|Mar 21, 2021	|Mar 26, 2021	|
    Then she should see the list of things to do top 10