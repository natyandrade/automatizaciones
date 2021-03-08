#Author: natyandrade@gmail.com

@manual
Feature: list flight with differents options
  As a web user
  A want list flight with different options
  To using the travelocity website

@manual1
  Scenario: list flight round trip
    Given that Naty wants into travelocity page home
    When search flight to "Peru"
    And select the dates and the option round trip
    Then she should see the list of flight round trip

@manual2
  Scenario: list flight one Way
    Given that Naty wants into travelocity page home
    When search flight to "Peru"
    And select the dates and the option one Way
    Then she should see the list of flight one Way