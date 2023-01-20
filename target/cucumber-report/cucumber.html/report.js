$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage of virgingames.com",
  "description": "\r\nAs a user I am on Homepage of virgingame site",
  "id": "homepage-of-virgingames.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5078503600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should nevigate to other page when click on different Menu Tabs",
  "description": "",
  "id": "homepage-of-virgingames.com;user-should-nevigate-to-other-page-when-click-on-different-menu-tabs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am on Home page I accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Online Slots tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I nevigate to online slots page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the text Play Online Slots at Virgin Games",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 106889300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.iAmOnHomePageIAcceptCookies()"
});
formatter.result({
  "duration": 1090294300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.iClickOnOnlineSlotsTab()"
});
formatter.result({
  "duration": 1120521900,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.iNevigateToOnlineSlotsPage()"
});
formatter.result({
  "duration": 17800,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.iVerifyTheTextPlayOnlineSlotsAtVirginGames()"
});
formatter.result({
  "duration": 1045964000,
  "status": "passed"
});
formatter.after({
  "duration": 1021185400,
  "status": "passed"
});
});