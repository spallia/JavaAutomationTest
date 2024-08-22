Feature: Form Submission

  Scenario: Successfully submit personal information
    Given I am on the form submission page
    When I fill in the form with valid data
    And I click the submit button
    Then I should see a success message indicating the form was submitted