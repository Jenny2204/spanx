
Feature: Check header elements on spanx.com

  Background: Check open site: https://spanx.com/
    Given I open the website spanx.com
    Then the URL should contain spanx.com
    And the page title should contain SPANX


  Scenario: Check elements in header
    Then I see the spanx.com logo
    Then I see the BestSellersButton item in the main menu
    Then I see the Leggings item in the main menu
    Then I see the ClothingButton item in the main menu
    Then I see the ActiveButton item in the main menu
    Then I see the SwimButton item in the main menu
    Then I see the Shapewear item in the main menu
    Then I see the Bras item in the main menu
    Then I see the Panties item in the main menu
    Then I see the Sale item in the main menu
    Then I see the Mens item in the main menu
    Then I see the History item in the main menu
    Then Search button is displayed
    And Close site

