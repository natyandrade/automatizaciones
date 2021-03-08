#Author: natyandrade@gmail.com

@manual
Feature: list of hotels with different filters
  As a web user
  A want select the different filters of the hotels
  To using the travelocity website

@manual1
  Scenario: list hotel sort by most star rating
    Given that Naty wants into travelocity page home
    When search a hotel in "Cancun"
    And select the option sort by most star rating
    Then she should see the list hotels sort by most star rating

@manual2
  Scenario: list hotel sort by price
  	Given that Naty wants into travelocity page home
    When search a hotel in "Cancun"
    And select the option sort by price
    Then she should see the list of hotels sort by price

@manual3
  Scenario: list hotel sort by deals
    Given that Naty wants into travelocity page home
    When search a hotel in "Cancun"
    And select the option sort by deals
    Then she should see the list of hotels sort by deals

@manual4
  Scenario: list hotel sort by recommended
    Given that Naty wants into travelocity page home
    When search a hotel in "Cancun"
    And select the option sort by recommended
    Then she should see the list of hotels sort by recommended