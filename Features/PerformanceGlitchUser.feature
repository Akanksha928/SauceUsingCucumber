Feature: Performance Glitch User Login 
	Description: This test is to check the login functionality of the SwagLab

Scenario: Login Successful 
	Given User is on the homepage 
	When User enters Username 
	And User enters Password 
	And User clicks on login button 
	And User clicks on Tshirt addcart button 
	And User clicks on Jacket addcart button 
	And User views cart products 
	Then test case is successful