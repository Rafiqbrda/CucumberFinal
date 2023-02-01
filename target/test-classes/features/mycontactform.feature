
Feature: Validate login of applitools
  Check login functionality with username and password
  
   Scenario Outline: Login dalidation
   
    Given open chrome and redirect to applications webside
    When Enter "<username>" and "<password>"
    Then Click submit

    Examples: 
      |username | password| 
      |anik     |anik123 | 
      | ibney   |ibney123|     
      |rafiq    |rafiq123|