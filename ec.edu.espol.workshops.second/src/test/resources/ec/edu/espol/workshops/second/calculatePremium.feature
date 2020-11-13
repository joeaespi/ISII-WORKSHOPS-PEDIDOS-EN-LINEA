Feature: Calculate the insurance prime for a customer 
Scenario: The customer is female and married
Given Customer is Female and married
When Calculate the premium
Then Prima is 300
Scenario: The customer is neither too young nor too old
Given The customer age is between 44 and 65 years old
When Calculate the calcule premiun for age
Then Prima is 400

