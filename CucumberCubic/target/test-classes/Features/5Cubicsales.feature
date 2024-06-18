Feature: Financials Sales 

@Demo  
  Scenario Outline: Create sales invoice
    Given user navigates to the Sales invoice
    Then check sales invoice displayed correctly "Create Sales Invoice"
    Then user1 enter <customer> and <reference> and <qty> and <amount>
    And user selects create
    Then sales invoice created correctly "Automation_Sales_"
    Then user submit the sales invoice
    Then user naviagtes to the home page 
        
   Examples:
   |customer|reference|qty|amount|
   |cub|Automation_Sales_|250.00|10.00|
   #|cub|Test2_Sales_|20.00|10.00|
   #|cub|Test3_Sales_|30.00|40.00|

@Demo
    Scenario Outline: Create sales invoice - missing unit and price
    Given user navigates to the Sales invoice
    Then check sales invoice displayed correctly "Create Sales Invoice"
    Then user2 enter <customer> and <reference>
    And user selects create
    Then check error message displayed
    Then user selects ok
    And user enters missing details <qty> and <amount>
    And user selects create 
    Then sales invoice created correctly "Automation_Sales_"
    Then user submit the sales invoice
    Then user naviagtes to the home page  
   Examples:
   |customer|reference|qty|amount|
   |cub|Automation_Sales_|250.00|10.00|