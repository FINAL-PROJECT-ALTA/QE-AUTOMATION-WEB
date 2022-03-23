Feature:Searching Guest in HealthyFit

@searching
  Scenario: Searching
    Given I open HealthyFit page
    When I click search
    And I input food name
    And I select food
    And I click search button
    Then Show some soto menu
