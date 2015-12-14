Feature: open Browse page
  In order to create some amazing value
  As a really important customer
  I should be able to view things in the browse page
  
  Scenario: Google Sign in
    Given I am on https://www.google.com
    When I click Sign in
    Then I should be on Sign in - Google Accounts
    
  Scenario Outline: Validate Page navigation
    Given I am on <webpage>
    When I click <pagelink>
    Then I should be on <titleofpage>
    
    Examples:
      | webpage               | pagelink  | titleofpage       |
      | http://www.bbc.co.uk  | News      | Home - BBC News   |
      | http://www.bbc.co.uk  | Sport     | BBC Sport - Sport |
      | http://www.bbc.co.uk  | Weather   | BBC Weather       |

