Feature: Goals User

  @creategoals
Scenario: Create Goals
  Given I open Healthy Fit homepage
  When I click login button
  And I input email and password
  And I click button login
  Then I can see the Healthy Fit profilepage
  When I click add your goals
  And I input height
  And I input weight
  And I input age
  And I input range day
  And I select the target
  And I input target of cut or bulk
  And I select the person activity type
  And I click add goals button
  Then I can see my goals