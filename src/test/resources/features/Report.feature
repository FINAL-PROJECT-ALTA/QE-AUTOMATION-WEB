Feature: Report Guest

  @reportdulu
  Scenario: Report
    Given I open HealthyFit
    When I click report
    Then Show some login page


  @cekprofile
  Scenario: Profile
    Given I open HealthyFit
    When I click profile
    Then Show some login page

  @cekrecommend
  Scenario: Recommend
    Given I open HealthyFit
    When I click recommend
    Then Show some login page

  @homepage
  Scenario: Healthy Fit homepage
    Given I open HealthyFit
    When I click Fruits
    And I click Peer
    Then Show nutrition about peer