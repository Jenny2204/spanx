
Feature: Check header elements on spanx.com

  Background: Check open site: https://spanx.com/
    Given I open the website spanx.com
    Then the URL should contain spanx.com
    And the page title should contain SPANX


  Scenario: Verify logo display
    Then I see the spanx.com logo

  Scenario: Verify main menu display
    Then I see the BestSellersButton item in the main menu
    And Close site


  Scenario: Verify main menu display button leggins in main menu
    Then I see the Leggings item in the main menu
    And Close site

  Scenario: Verify main menu display  Clothing Button
    Then I see the ClothingButton item in the main menu
    And Close site

  Scenario: Verify main menu display  activeButton  Button
    Then I see the ActiveButton item in the main menu
    And Close site

  Scenario: Verify main menu display  swimButton  Button
    Then I see the SwimButton item in the main menu
    And Close site

  Scenario: Verify main menu display  swimButton  Button
    Then I see the Shapewear item in the main menu
    And Close site

  Scenario: Verify main menu display  swimButton  Button
    Then I see the Bras item in the main menu
    And Close site

  Scenario: Verify main menu display  swimButton  Button
    Then I see the Panties item in the main menu
    And Close site
  Scenario: Verify main menu display  swimButton  Button
    Then I see the Mens item in the main menu
    And Close site
  Scenario: Verify Sale menu display  swimButton  Button
    Then I see the History item in the main menu
    And Close site


 # Scenario: Verify main menu display
#    Then I see the "Shop" item in the main menu
#    And I see the "About" item in the main menu
#    And I see the "Blog" item in the main menu
#    And I see the "Contact" item in the main menu
#
#  Scenario: Verify search button display
#    Then I see the search button
#
#  Scenario: Verify cart display
#    Then I see the cart with itemsоварами