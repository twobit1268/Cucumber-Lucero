Feature: Login functionality
  As a user
  I want to log in to the application
  So that I can access protected content

  Background:
    Given I am on the login page

  Scenario: Successful login with valid credentials
    When I enter username "tomsmith"
    And I enter password "SuperSecretPassword!"
    And I click the login button
    Then I should see the message "You logged into a secure area!"

  Scenario: Failed login with invalid credentials
    When I enter username "wronguser"
    And I enter password "wrongpassword"
    And I click the login button
    Then I should see the message "Your username is invalid!"

  Scenario Outline: Login with multiple credential sets
    When I enter username "<username>"
    And I enter password "<password>"
    And I click the login button
    Then I should see the message "<message>"

    Examples:
      | username  | password              | message                        |
      | tomsmith  | SuperSecretPassword!  | You logged into a secure area! |
      | baduser   | badpass               | Your username is invalid!      |
