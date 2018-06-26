$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "line": 3,
  "name": "Test Log In to MI",
  "description": "",
  "id": "test-log-in-to-mi",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "test-log-in-to-mi;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 10142798193,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 345164535,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 1602671341,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 114405,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Successful LogOut",
  "description": "",
  "id": "test-log-in-to-mi;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 145496,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_LogOut_Successfully()"
});
formatter.result({
  "duration": 76673,
  "status": "passed"
});
});