Feature:Check open site. should be home page opens
  Scenario: Check that home page is opened
    Given Open site
    Then Check current url
#    And Check title
#    And Check elements in header
    And Close site
