Feature: Sign Up functionality of Facebook
  
Scenario: Password validation during Sign Up for Facebook
  
Given User is on facebook sign up page
When User fills all the fields by entering password with less characters
			| Fields      | Values 		 |
			| FirstName   | Lisa   		 |
			| SurName     | Ray    		 |
			| MobileNumber| 9909909909 |
			| Password    | qwe        |
			| Day         | 20         |
			| Month       | 11         |
			| Year        | 1990       |     
And Click on 'Sign Up' button 
Then User can see the error message for invalid password
