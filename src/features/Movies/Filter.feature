@Filter
Feature: Filter

  @detailsScreen @Smoke
  Scenario: going from main movies list screen to the details screen of the app
    Given User at main movies screen
    When  User clicks on the details button
    Then  User should be redirected to details screen