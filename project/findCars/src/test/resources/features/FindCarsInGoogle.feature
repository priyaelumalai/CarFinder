@selenium
Feature: List of GumTree links in the Google Search list

  @searchCarsInLondon
  Scenario Outline: As a tester, I want to search the cars in london, to find the number of GumTree links displayed
    Given user has the "<Browser>" browser open on "<OS>" OS
    When user opens Google
    And search "Cars in London"
    Then user can see the number of gumtree links displayed
    And user can navigate to the gumtree links and check the title of the page

    Examples:
  | Browser | OS           |
  | Chrome  | Windows      |
