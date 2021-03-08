#Author: natyandrade@gmail.com

@manual
Feature: things to do in a destination
  As a web user
  A want select the option things to do
  To using the travelocity website

@manual1
  Scenario: select things to do in a destination
    Given that Naty wants into travelocity page home
    When search things to do in "Cancun"
    And select the dates
    Then she should see the list of things to do
