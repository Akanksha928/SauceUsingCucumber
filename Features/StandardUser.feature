Feature: Standard User Login 

Scenario: Login Successful and Products added to cart 
	Given User is on the homepage 
	When User enters username as "standard_user" 
	And User enters Password as "secret_sauce" 
	And User clicks on login button 
	And User adds products to cart 
	And User views cart products 
	Then test case is successful