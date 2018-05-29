$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("allscenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Order T-shirt and verify in order history",
  "description": "",
  "id": "order-t-shirt-and-verify-in-order-history",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User able to order a Tshirt",
  "description": "",
  "id": "order-t-shirt-and-verify-in-order-history;user-able-to-order-a-tshirt",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user selects a product and add it to cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user orders a Tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "order is reflecting in order history",
  "keyword": "Then "
});
formatter.match({
  "location": "TestFlow.user_login_to_the_application()"
});
formatter.result({
  "duration": 57848460374,
  "status": "passed"
});
formatter.match({
  "location": "TestFlow.user_selects_a_product_and_add_it_to_cart()"
});
formatter.result({
  "duration": 15186092856,
  "status": "passed"
});
formatter.match({
  "location": "TestFlow.order_summary_page_displayed_and_user_clicks_I_confirm_Order_button()"
});
formatter.result({
  "duration": 7143393941,
  "status": "passed"
});
formatter.match({
  "location": "TestFlow.order_is_reflecting_in_order_history()"
});
formatter.result({
  "duration": 2256865936,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User updates the personal information",
  "description": "",
  "id": "order-t-shirt-and-verify-in-order-history;user-updates-the-personal-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user updates personal information",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "updates are saved in user info",
  "keyword": "Then "
});
formatter.match({
  "location": "TestFlow.user_login_to_the_application()"
});
formatter.result({
  "duration": 29668563682,
  "status": "passed"
});
formatter.match({
  "location": "TestFlow.user_updates_personal_information()"
});
formatter.result({
  "duration": 1298937,
  "error_message": "java.lang.NullPointerException\r\n\tat Stepdefinition.TestFlow.user_updates_personal_information(TestFlow.java:58)\r\n\tat ✽.When user updates personal information(allscenarios.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestFlow.updates_are_saved_in_user_info()"
});
formatter.result({
  "status": "skipped"
});
});