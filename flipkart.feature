Feature: Flipkart application verification
Scenario: Search camera and validate details
    Given I am on the flipkart Page "https://www.https://www.flipkart.com/"
    When I login to flipkart using valid credentials
    | UserName  | Password |
	| Sreedevi  | Abcd1234 |
		    
	And click on Login Button
	And Search Camera as "Nikon Camera" 
    And select "Nikon D7500 DSLR Camera Body with 18-140 mm Lens" as camera model
    And verify 
    
    | Name  											| Price  |
	| Nikon D7500 DSLR Camera Body with 18-140 mm Lens  | 74,999 |
	
	And click on add to cart button
	
	And verify the name and price
	| Name  											| Price  |
	| Nikon D7500 DSLR Camera Body with 18-140 mm Lens  | 74,999 |
	
	Then click logout button 	
