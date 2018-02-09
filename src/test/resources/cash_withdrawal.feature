Feature: Cash Withdrawal
  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $100.00 in my account
    When I withdraw $20
    Then $20 should be dispensed
    And the balance of my account should be $80.00
    
  Scenario: Selenium Test
    Given I am on the landing page
    When I submit the form
       |Fields|Value|
       |Name|John K|
       |Age|30|
       |Address|Street1|
       |City|Lexington|
       |State|SC|
    Then It should be taken to success page.