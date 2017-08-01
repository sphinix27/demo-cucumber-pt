# Imperative style
Feature: Pivotal Tracker Sign In

  In order to Sign in Pivotal Tracker we have to enter valid credentials

  Background:
    Given I am at Pivotal Tracker "Home" page
    When I click on the "Sign In" button

  #Imperative style
#  Scenario: Successful Sign In to Pivotal Tracker
#    When I fill in the "Username or Email" field with "demouser2710@gmail.com"
#    And I click on "Next" Button
#    And I fill in the "Password" field with "secret2710"
#    And I click on "Sign In" Button
#    Then I should see "Dashboard page"

  #Declarative style
  Scenario: Successful Sign In to Pivotal Tracker
    Given I am at Pivotal Tracker "Sign In" page
    When I log in
    Then I should see "Dashboard" page