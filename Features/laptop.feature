Feature:To validate the price of the laptop
Scenario:To validated the first product
Given The user has to be in home page
When The user should search laptop in  search box
And The user has to select the first product
And The user has to print the product name and price
Then The user has to validate the price and the user go  backward if the price is more that QAR 100
Then The user has to select the second product

