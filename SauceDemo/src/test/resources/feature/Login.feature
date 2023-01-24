@FullSuite
Feature: Login

  @valid_login
  Scenario Outline: Correct Login
    Given user is on <app> website login page
    When user enters the correct username and password
    And clicks on login button
    Then homepage should be displayed.

    Examples: 
      | app        |
      | Sauce Demo |

  @invalid_login
  Scenario Outline: Incorrect Login
    Given user is on <app> website login page
    When user enters the incorrect username and password
    And clicks on login button
    Then error meaages should be displayed.

    Examples: 
      | app        |
      | Sauce Demo |