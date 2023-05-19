Feature: Opening the main page
  Scenario:Opening the main page of spanx.com
    Given I open the website spanx.com
    Then the URL should contain spanx.com
    And the page title should contain SPANX
    And Close site
