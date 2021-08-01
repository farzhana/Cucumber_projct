Feature: LoginFeature
	Description:This feature will be used to ligin to Simplilearn application
	
	@PositiveLogin @Sanity
	Scenario Outline: Verify that when user enters correct username and password they should be login
		Given user has opened simplilearn application
		When user clicks on login link
		And user enters correct username "<Username>"
		And user enters correct pasword " <password>"
		And user clicks on Login button
		Then user should be landed on the home page
		And user should be able to see the welcome page
 
    Examples: 
      | Username  			| password 			|
      | abc@xyz.com 		|  abc123 			|
      

      
  @NegativeLogin @Sanity
	Scenario Outline: Verify that when user enters correct username and password they should be login
		Given user has opened simplilearn application
		When user clicks on login link
		And user enters correct username "<Username>"
		And user enters correct pasword " <password>"
		And user clicks on Login button
		Then user should be landed on the home page
		And user should be able to see the welcome page
 
    Examples: 
      | Username  					| password 			|
      | farzhana@xyz.com 		|  lmn789				|
      
      