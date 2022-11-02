Feature: Problem User Login 

Scenario: Login Successful
	Given User is on the homepage 
	When User enters username as "problem_user" 
	And User enters Password as "secret_sauce" 
	And User clicks on login button 