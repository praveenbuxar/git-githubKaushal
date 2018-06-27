Feature: Test smoke scenarion of gmail application
Scenario: Test gmail with valid credential

		Given open firefox and start application
		When  i enter valid username and valid password
		Then  user should be able to login succesfully
		