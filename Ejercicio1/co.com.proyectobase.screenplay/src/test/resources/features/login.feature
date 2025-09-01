Feature: Login to Space Advisor

  @LoginSuccesful @Login
  Scenario Outline: "<id>" Login succesfull
    Given the user open application Space Advisor
    When enter your credentials "<username>" "<password>"
    Then the user valid your name in home page

    Examples:
      | id    | username   | password   |
      | TC-01 | demo       | demo123    |
      | TC-02 | admin      | adminPass  |
      | TC-03 | ´++´{**__- | ´++´{**__- |
      | TC-04 | 123        | 123        |

  @LoginFailure @Login
  Scenario Outline: "<id>" Wrong messages in Login
    Given the user open application Space Advisor
    When enter your credentials "<username>" "<password>"
    Then the user observes "<testType>" error with messages "<errorMessages>"
    Examples:
      | id    | username | password | testType | errorMessages                                           |
      | TC-05 |          | demo123  | 1        | Name is a required field.                               |
      | TC-06 | demo     |          | 2        | Password is a required field.                           |
      | TC-07 |          |          | 3        | Name is a required field.,Password is a required field. |
