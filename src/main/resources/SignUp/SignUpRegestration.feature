Feature:User Registration
  As a new user
  I want to register on the Spanx website

  Background: Check open site: https://spanx.com/
    Given I open the website spanx.com
    Then the URL should contain spanx.com
    And the page title should contain SPANX

  Scenario: Check open register page
    When Click on sign in icon
    And Click on the button create an account
    Then Register page open sucssufuly

  Scenario: Successful user registration
    When Fill user name
    And Fill last nane
    And  Fill password
    And Fill email adress
    And click on the button create an account
    Then account create sucssufuly
    And Close site
