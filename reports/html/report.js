$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FindCarsInGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "List of GumTree links in the Google Search list",
  "description": "",
  "id": "list-of-gumtree-links-in-the-google-search-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@selenium"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "As a tester, I want to search the cars in london, to find the number of GumTree links displayed",
  "description": "",
  "id": "list-of-gumtree-links-in-the-google-search-list;as-a-tester,-i-want-to-search-the-cars-in-london,-to-find-the-number-of-gumtree-links-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@searchCarsInLondon"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user has the \"\u003cBrowser\u003e\" browser open on \"\u003cOS\u003e\" OS",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user opens Google",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search \"Cars in London\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can see the number of gumtree links displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user can navigate to the gumtree links and check the title of the page",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "list-of-gumtree-links-in-the-google-search-list;as-a-tester,-i-want-to-search-the-cars-in-london,-to-find-the-number-of-gumtree-links-displayed;",
  "rows": [
    {
      "cells": [
        "Browser",
        "OS"
      ],
      "line": 13,
      "id": "list-of-gumtree-links-in-the-google-search-list;as-a-tester,-i-want-to-search-the-cars-in-london,-to-find-the-number-of-gumtree-links-displayed;;1"
    },
    {
      "cells": [
        "Chrome",
        "Windows"
      ],
      "line": 14,
      "id": "list-of-gumtree-links-in-the-google-search-list;as-a-tester,-i-want-to-search-the-cars-in-london,-to-find-the-number-of-gumtree-links-displayed;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "As a tester, I want to search the cars in london, to find the number of GumTree links displayed",
  "description": "",
  "id": "list-of-gumtree-links-in-the-google-search-list;as-a-tester,-i-want-to-search-the-cars-in-london,-to-find-the-number-of-gumtree-links-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@selenium"
    },
    {
      "line": 4,
      "name": "@searchCarsInLondon"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user has the \"Chrome\" browser open on \"Windows\" OS",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user opens Google",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search \"Cars in London\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can see the number of gumtree links displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user can navigate to the gumtree links and check the title of the page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 14
    },
    {
      "val": "Windows",
      "offset": 39
    }
  ],
  "location": "SearchCars.user_has_the_browser_open(String,String)"
});
formatter.result({
  "duration": 8899383371,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.user_opens_Google()"
});
formatter.result({
  "duration": 3871260305,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cars in London",
      "offset": 8
    }
  ],
  "location": "SearchCars.search(String)"
});
formatter.result({
  "duration": 4439052103,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.user_can_see_the_number_of_gumtree_links_displayed()"
});
formatter.result({
  "duration": 1855855674,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.check_the_title_of_the_page()"
});
formatter.result({
  "duration": 17311545994,
  "status": "passed"
});
formatter.after({
  "duration": 1514660451,
  "status": "passed"
});
});