Feature: Gmail Login
        As a user I should able to login into Gmail.

  Scenario: I login with valid credential
    Given I navigate to "http://the-internet.herokuapp.com/login"
    And I enter "tomsmith" into input field having id "username"
    And I enter "SuperSecretPassword!" into input field having id "password"
    When I click on element having class "radius"
    Then I should get logged-in
    Then I close browser

  Scenario: I login with invalid credential
    Given I navigate to "http://the-internet.herokuapp.com/login"
    And I enter "tomsmith" into input field having id "username"
    And I enter "wrong" into input field having id "password"
    When I click on element having class "radius"
    Then I should not get logged-in
    Then I close browser
