Feature: Create Project page from the quick menu

@Regression
  Scenario Outline: user able to create a new project
    Given user selected Project menu
    Then User selects Project <projecttype> page
    Then user lands on project page "Project"    
    Then user enter all the required details
    Then Project created 
    
   Examples:
   |projecttype|
   |ADMIN|
      
@Demo      
  Scenario Outline: user able to create a new project
    Given user selected Project menu
    Then User selects Project <projecttype> page
    Then user lands on project page "Project"   
    Then user enter all the required details
    Then Project created 
    
   Examples:
   |projecttype|
   |FEE|