Feature: Test

    Scenario: Test
        Given I have a valid API key
        When I send a GET request to the API
        Then I should receive a valid response