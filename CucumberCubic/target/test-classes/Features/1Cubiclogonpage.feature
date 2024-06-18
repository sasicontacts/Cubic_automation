Feature: Login to the cubic home page

@Demo
  Scenario: Open cubic interactive home page displayed correctly
    Given browser is open
    Then user is logon page and enter login in details 
    Then user located home page title "Dashboard | Rapport3c"

 #Examples:
 #|1|QA|
 #|2|Preprod|