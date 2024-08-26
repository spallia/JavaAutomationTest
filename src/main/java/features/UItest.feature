Feature: UI_tests

  Background: Form filling and submission

  Scenario: Submit the practice form
    Given I navigate to automation practice form in demoqa application
    When I fill the all details in the form
    And I click on submit the form
    Then I verify the thanks modal