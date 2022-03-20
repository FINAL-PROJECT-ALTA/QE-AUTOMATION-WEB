Feature: Login user
#As a user
#I want to perform login on healthy fit
#So that I can see the healthy fit homepage

@newlogin
Scenario: Login Healthy Fit
  Given I open Healthy Fit homepage
    When I click login button
    And I input email and password
    And I click button login
    Then I can see the Healthy Fit homepage

@invalidemail
Scenario: Login with invalid email and valid password
  Given I open Healthy Fit homepage
    When I click login button
    And I input invalid email and valid password
    And I click button login
    Then I can't see Healthy Fit homepage

@invalidpassword
Scenario: Login with email and invalid password
  Given I open Healthy Fit homepage
  When I click login button
  And I input email and invalid password
  And I click button login
  Then I can't see Healthy Fit homepage

@invalidemailpassword
Scenario: Login with invalid email and invalid password
  Given I open Healthy Fit homepage
  When I click login button
  And I input invalid email and invalid password
  And I click button login
  Then I can't see Healthy Fit homepage

@blankemail
Scenario: Login with blank email
  Given I open Healthy Fit homepage
  When I click login button
  And I skip to fill email section and then i fill password section
  And I click button login
  Then I can't see Healthy Fit homepage

@blankpassword
Scenario: Login with blank password
  Given I open Healthy Fit homepage
  When I click login button
  And I skip to fill password section and then i fill email section
  And I click button login
  Then I can't see Healthy Fit homepage
