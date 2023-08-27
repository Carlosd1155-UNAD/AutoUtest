Feature: Create a new user
  I as user, I need create a new user into Utest web page

  Background: Initialize the browser
    Given the user starts the browser

  @case1
  Scenario: Create a user
    Given the user select the register option
    When he fills the step 1 using the following information
      | First name | Last name | Email                | Birth Day | Birth Month | Birth Year | Languages spoken |
      | Bill       | Warman    | billywg98@mymail.com | 14        | July        | 1992       | Spanish          |
    And continue filling the location form using the following information
      | City  | Zip code | Country       |
      | Miami | 1111111  | United States |
    And in the step 3 he fills the devices form
      | PC OS | PC OS Version | PC OS Language | Mobile brand | Mobile model   | Mobile OS  |
      | Linux | Fedora        | English        | Samsung      | Galaxy S8 Plus | Android 10 |
    And next, the user set a password "Contoso*sMiaUS92$"
    Then finally the user can see the welcome banner "Welcome to the world's largest community of freelance software testers!"
