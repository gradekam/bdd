Feature: Zbodify playlist zadanie

  Scenario: User should be able to have the app running in the background and paying music while having the home screen open
    Given I am logged in
    When I click on a song to start playing
    And I open the home screen
    Then the song continues to play
    And I can open the home screen

  Scenario: User should be able to have the app running in the background and paying music while having the screen turned off
    Given I am logged in
    When I click on a song to start playing
    And I turn off the screen
    Then the song continues to play

  Scenario: User should be able to have the app running in the background and paying music while having the other app open
    Given I am logged in
    When I click on a song to start playing
    And I open the other app
    Then the song continues to play
    And I can use the other app