Feature: Login Functionality Feature
   Is used to test the same scenario with multiple data sets as examples.

  Scenario Outline: Login Functionality
    Given user navigates to SOFTWARETESTINGHELP.COM
    When user logs in using Username as <username> and Password <password>
    Then login should be successful

    Examples: 
      | username | password  |
      | Tom      | password1 |
      | Harry    | password2 |
      | Jerry    | password3 |

  Scenario Outline: Login Functionality2
    Given user navigates to SOFTWARETESTINGHELP.COM
    When user logs in using Username as <username and Password <password>
    Then login should  not be successful

    Examples: 
      | username | password |
      | Tom      | xew32    |
      | Harry     | xcfsa2   |
      | Jerry    |  2342343 |
