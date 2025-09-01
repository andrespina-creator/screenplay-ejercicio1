Feature: Card Deployment in Space Advisor

  @CardDeplyomentSuccessful
  Scenario Outline: Card Deployment correctly
    Given the user open application Space Advisor with the test id: "<id>"
    When the user selects the "<launch>" and the "<planetColor> and the amount"
    When the user selects a card
    Then the checkout screen shows out

    Examples:
      | id    | launch | planetColor |
      | TC-01 | demo   | demo123     |