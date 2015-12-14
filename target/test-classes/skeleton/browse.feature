Feature: open Browse page
  In order to create some amazing value
  As a really important customer
  I should be able to view things in the browse page
  
  Scenario: Google Sign in
    Given I am on https://www.google.com
    When I click Sign in
    Then I should be on Sign in - Google Accounts