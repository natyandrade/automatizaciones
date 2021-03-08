#Author: natyandrade@gmail.com

@manual
Feature: list of cars with different filters
  As a web user
  A want select the different filters of the cars
  To using the travelocity website

@manual1
  Scenario: list cars sort by total price
    Given that Naty wants into travelocity page home
    When search a cars in "Cancun"
    And select the option sort by total price
    Then she should see the list cars sort by total price

@manual2
  Scenario: list cars sort by distance
  	Given that Naty wants into travelocity page home
    When search a cars in "Cancun"
    And select the option sort by distance
    Then she should see the list cars sort by distance

@manual3
  Scenario: list cars sort by customer rating
    Given that Naty wants into travelocity page home
    When search a cars in "Cancun"
    And select the option sort by customer rating
    Then she should see the list cars sort by customer rating