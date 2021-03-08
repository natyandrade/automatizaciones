#Author: natyandrade@gmail.com

Feature: things to do in a destination
  As a web user
  A want select the option things to do
  To using the travelocity website

Background:
    Given that Naty wants into travelocity website

  Scenario: look things to do in a destination
    When search things to do in "Cancun"
    And select the dates
    Then she should see the list of things to do