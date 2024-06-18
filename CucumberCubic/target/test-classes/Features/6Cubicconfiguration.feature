Feature: Check all the configuration

@Smoke
  Scenario: Navigate to the configuration menu
    Given user navigates to the configuration page
    And configuration page displayed correctly "Settings"
    Then user click the menu button
    
@Smoke    
  Scenario Outline: Validate all the configuration links
     Given user select the configuration <config>
     Then validate the title <configtitle>
   
   Examples:
   |config|configtitle|
   |Our company|Our company|
   |Branding|Branding|
   |User management|User management|
   |Security groups|Security groups|
   |Record security|Record security|
   |Menu security|Menu security|
   |Fields|Fields|   
   #|Layouts: dashboard|Layouts: dashboard|
   #|Layouts: mobile|Layouts: mobile|
   #|Sections: forms|Sections: forms|
   #|Sections: dashboard panels|Sections: dashboard panels|
   #|Sections: mobile forms|Sections: mobile forms|
   #|Suggestions|Suggestions|
   #|Business entities|Business entities|
   #|Chart of accounts|Chart of accounts|
   #|Tax accounts|Tax accounts|
   #|System currencies|System currencies|
   #|Currency exchange rate overrides|Currency exchange rate overrides|
   #|Currency exchange rate history|Currency exchange rate history|      
   #|Sales invoice settings|Sales invoice settings|
   #|Purchase invoice settings|Purchase invoice settings|
   #|Project settings|Project settings|
   #|Default teams|Default teams|
   #|Grade rate cards|Grade rate cards|
   #|Workstage templates|Workstage templates|
   #|Bill fees types|Bill fees types|
   #|TimeSheet entry settings|TimeSheet entry settings|
   #|Expenses settings|Expenses settings|
   #|Leave templates|Leave templates|
   #|Absence types|Absence types|
   #|Business process templates|Business process templates|
   #|Custom reports|Custom reports|
   #|System reports|System reports|
   
@Smoke       
   Scenario Outline: Validate use back to Rapport
     Given user clicks back to rapport
     Then back to home page "Dashboard | Rapport3c" 