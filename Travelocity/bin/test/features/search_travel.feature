    #Author: natyandrade@gmail.com

    Feature: Search for a travel with Travelocity
      As a web user
      A want to search a travel
      To using the application
    
       Scenario: search for a travel
        Given that Naty wants go to travelocity page
        When she search a travel 
        |from			|to			|
        |Colombia	|Cancun	|
        Then she should see the travel search results
