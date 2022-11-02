Feature: SwagLab login 
	Description: This test is to check the login functionality of the SwagLab

Scenario: Login Successful 
	Given User is on the homepage 
	When User enters username as "locked_out_user" 
	And User enters Password as "secret_sauce" 
	And User clicks on login button 