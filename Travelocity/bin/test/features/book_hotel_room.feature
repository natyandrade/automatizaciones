#Author: natyandrade@gmail.com


Feature: book a hotel room
  As a web user
  A want book a hotel room
  To using the travelocity website


  Scenario: book a hotel room
  	Given that Naty wants into travelocity website
    When looking for a hotel with the following data
    |destination |check_in     	|check_out    	|
    |Bogota      |Apr 25, 2021. |Apr 30, 2021.	|
    And book a hotel room
    |nameHotel					|
    |Hostal Villa Gloria|
    Then she should see the room was selected