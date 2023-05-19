
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