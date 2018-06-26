
@tag
Feature:Test LogIn to MI with Wrong Cred

 
 Scenario: UnSuccessful Login with Invalid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Incorrect Password
	Then Message displayed Login Failed !
 