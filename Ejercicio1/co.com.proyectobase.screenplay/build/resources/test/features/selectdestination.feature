Feature: Select Destination in Space Advisor

  @SelectDestination
  Scenario Outline: "<id>" Select Destination Successful
    Given the user open application SA
    When the user sets the trip date at the "<startDate>" day, "<finishDate>" day, with "<adultCount>" adults and "<childrenCount>" kids
    Then the user can see the trip info "<startDate>" day, "<startMonth>" month, "<finishDate>" day,"<finishMonth>" month, with "<adultCount>" adults and "<childrenCount>" kids

    Examples:
      | id    | startDate | startMonth | finishDate | finishMonth | adultCount | childrenCount |
      | TC-01 | 1         | Oct        | 3          | Dec         | 3          | 2             |
      | TC-01 | 1         | Oct        | 20         | Dec         | 15         | 3             |