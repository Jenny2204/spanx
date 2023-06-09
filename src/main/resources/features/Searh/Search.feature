Feature: check the search-input
  Background: Check open site: https://spanx.com/
    Given I open the website spanx.com
    Then the URL should contain spanx.com
    And the page title should contain SPANX

  Scenario:Opening the main page of spanx.com and see Search button is displayed
    Then  Search button is displayed
   And Close site

  Scenario:Opening the main page of spanx.com and click on search-input and check relavant result
    Then  Search button is displayed
    When I enter search field
    And I click on the search button
    Then Verify the search result page
    Then Verify the relevant result page
    And Close site
