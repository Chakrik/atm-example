Feature: Google test

  Scenario: Carolina test
    Given I am on "http://google.com" website
    When I enter "Carolina" into the search box
    And I click the "Google Search" button
    And I click the link "Carolina - Wikipedia"
    Then I should get Carolina Wikipedia Page
