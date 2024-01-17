

Feature: Registration 
 

 
@integration  
Scenario: Create a New User with Valid Details 
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length between 3 to 13 <Mukesh Kumar>  
And user fills "registration password textbox" with  Valid length of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see Email confirmation Page 

Scenario: Create a New User with Valid Details Without Checking Terms and conditions 
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length between 3 to 13 <Mukesh Kumar>  
And user fills "registration password textbox" with  Valid length of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning message with "You must agree to our General Terms & Conditions to continue" 

Scenario: Create a New User with Valid Details Without Checking Captch Checkbox
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length between 3 to 13 <Mukesh Kumar>  
And user fills "registration password textbox" with  Valid length of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning message with "The security check is a required field. Please enter the code.

Scenario: Create a New User with Valid Details Without Selecting day Month and Year Checkbox
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length between 3 to 13 <Mukesh Kumar>  
And user fills "registration password textbox" with  Valid length of  10 or More than 10 <Password@123> 
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning message with "The security check is a required field. Please enter the code.

Scenario: Create a New User with Valid Details with Existing Nickname 
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length between 3 to 13 <Mukesh Kumar>  
And user fills "registration password textbox" with  Valid length of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning Message on the Nickname TextField  

Scenario: User does not follow form validations entering Invalid email and all valid details 
When user fills "registration email textbox" with valid email <arprkmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length Nickname between 3 to 13 <Mukeshkumar>  
And user fills "registration password textbox" with  Valid length password of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see Email confirmation Page to Validate thier Email 
Scenario: User does not follow form validations entering Invalid Nickname of length 2 
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length Nickname between 3 to 13 <Mu>  
And user fills "registration password textbox" with  Valid length password of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning Message on the Nickname TextField 

Scenario: User does not follow form validations entering Invalid password of Length less than 10 
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length Nickname between 3 to 13 <Mu>  
And user fills "registration password textbox" with  Valid length password of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning Message on the Password TextField 

Scenario: User does not follow form validations entering Invalid password of Length less than 10 
When user fills "registration email textbox" with valid email <arprankmaster2020@gmail.com>
And user fills "registration NickName textbox" with Valid length Nickname between 3 to 13 <Mu>  
And user fills "registration password textbox" with  Valid length password of  10 or More than 10 <Password@123> 
And Enter the Following details 
| Date | 17| | Month | 02| | Year | 1992 |  
And check the "i am not Robot" captcha checkBox
And check the "i agree with the GTC and dataProtection Guidelines"
And user clicks "on "BEGIN  ADVENTURE" button
Then user should see warning Message on the Password TextField 

















