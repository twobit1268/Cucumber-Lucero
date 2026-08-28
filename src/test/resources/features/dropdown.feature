Feature: Dropdown selection
  As a user
  I want to select options from a dropdown
  So that I can change my selection

  Background:
    Given I am on the dropdown page

  Scenario: Select Option 1 from dropdown
    When I select "Option 1" from the dropdown
    Then "Option 1" should be selected

  Scenario: Select Option 2 from dropdown
    When I select "Option 2" from the dropdown
    Then "Option 2" should be selected
