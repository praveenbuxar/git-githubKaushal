Feature: Test facebook smoke scenario
Scenario: Test login with valid credential
	Given open firefox and start application
	When I enter valid username and password
	Then user should be login succesfully
	