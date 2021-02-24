$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/Home.feature");
formatter.feature({
  "name": "Home",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify links are working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.Teststeps.browser_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to homepage",
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.Teststeps.user_is_navigated_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify links",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.Teststeps.user_clicks_on_link_verifylinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.Teststeps.browser_is_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check validations on contact page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.Teststeps.browser_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to homepage",
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.Teststeps.user_is_navigated_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Get in touch button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.Teststeps.user_click_getInTouch_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submit form without entering values",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.Teststeps.submit_form_without_entering_values()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify validations are showing",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.Teststeps.verify_all_validations_Are_Showing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.Teststeps.browser_is_closed()"
});
formatter.result({
  "status": "passed"
});
});