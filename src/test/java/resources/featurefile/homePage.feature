Feature: HomePage of virgingames.com

  As a user I am on Homepage of virgingame site

  Scenario: User should nevigate to other page when click on different Menu Tabs
    Given I am on Home Page
    When  I am on Home page I accept cookies
    And   I click on Online Slots tab
    And   I nevigate to online slots page
    Then  I verify the text Play Online Slots at Virgin Games
