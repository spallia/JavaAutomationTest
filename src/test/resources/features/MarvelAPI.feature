Feature: Retrieve Marvel Characters in a Comic

  Scenario: Get characters featured in a specific comic
    Given I have access to the Marvel API
    When I request details for the comic with ID "12345"
    Then I should see the following characters:
      | Character Name  |
      | Spider-Man      |
      | Iron Man        |