Feature: Checkbox interactions
  As a user
  I want to interact with checkboxes
  So that I can toggle options on the page

  Background:
    Given I am on the checkboxes page

  Scenario: Check an unchecked checkbox
    Given checkbox 1 is unchecked
    When I click checkbox 1
    Then checkbox 1 should be checked

  Scenario: Uncheck a checked checkbox
    Given checkbox 2 is checked
    When I click checkbox 2
    Then checkbox 2 should be unchecked
