Feature: API_tests

  Background: Marvel comics

  Scenario Outline: Get characters featured in a specific comic
    Given I have access to the Marvel API
    When I request details for the comic with ID "12345"
    Then I should see the following characters:'<Character Name>'
    Examples:
      | Character Name |
      | Spider-Man     |
      | Iron Man       |


